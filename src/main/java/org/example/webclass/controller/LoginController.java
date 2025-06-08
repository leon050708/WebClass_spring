package org.example.webclass.controller;

import org.example.webclass.mapper.UserMapper;
import org.example.webclass.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") 
public class LoginController {

    private final UserMapper userMapper;

    @Autowired
    public LoginController(UserMapper userMapper) {
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
}