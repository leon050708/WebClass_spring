package org.example.webclass.controller;

import org.example.webclass.mapper.UserMapper;
import org.example.webclass.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserMapper userMapper;

    @Autowired
    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User user) {
        User use = userMapper.findUserByNameAndPassword(user.getName(), user.getPassw());
        System.out.println(user.getName()+"   "+user.getPassw());

        if (use != null) {
            System.out.println("用户对象信息：" + use.toString());

            use.setPassw(null);
            return ResponseEntity.ok(use);
        } else {
            System.out.println("登录失败：用户名或密码错误。");
            return ResponseEntity.ok(null);

        }
    }

    @PostMapping("/regist")
    public ResponseEntity<?> register(@RequestBody User user) {
        System.out.println(user);
        User use = userMapper.findUser(user.getName());
        System.out.println(use);
        if (use == null) {
            userMapper.insertUser(user);
            user = userMapper.findUser(user.getName());
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body(Map.of("message", "注册失败：该用户名已被占用"));
        }
    }

    @GetMapping("/user/{id}/stars")
    public ResponseEntity<List<String>> getStars(@PathVariable Long id) {
        String stars = userMapper.findStarsById(id);
        if (stars != null && !stars.isEmpty()) {
            // 如果stars不为空，按逗号分割成列表返回
            return ResponseEntity.ok(Arrays.asList(stars.split(",")));
        }
        // 如果为空，返回一个空列表
        return ResponseEntity.ok(Collections.emptyList());
    }

    @PostMapping("/user/{id}/stars")
    public ResponseEntity<?> updateStars(@PathVariable Long id, @RequestBody Map<String, String> payload) {
        String stars = payload.get("stars");
        if (stars == null) {
            return ResponseEntity.badRequest().body(Map.of("message", "请求体中缺少'stars'字段"));
        }
        try {
            userMapper.updateUserStars(id, stars);
            return ResponseEntity.ok(Map.of("message", "收藏更新成功"));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Map.of("message", "更新失败：" + e.getMessage()));
        }
    }
}