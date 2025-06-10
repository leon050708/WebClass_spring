package org.example.webclass.mapper;

import org.example.webclass.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper // 声明这是一个 MyBatis mapper 接口
public interface UserMapper {
    User findUserByNameAndPassword(@Param("name") String username, @Param("passw") String password);

    void insertUser(User user);

    User findUser(@Param("name") String name);

    // 新增：根据用户ID查询stars字段
    String findStarsById(@Param("id") Long id);

    // 修改：更新用户的stars字段，注意参数从int改为了Long，并增加了stars字符串
    void updateUserStars(@Param("id") Long id, @Param("stars") String stars);
}