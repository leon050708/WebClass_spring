package org.example.webclass.mapper;

import org.example.webclass.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper // 声明这是一个 MyBatis mapper 接口
public interface UserMapper {
    User findUserByNameAndPassword(@Param("name") String username, @Param("passw") String password);

    void insertUser(User user);

    User findUser(@Param("name") String name);

    void updateUserstars(@Param("id") int id);
}