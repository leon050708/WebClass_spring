package org.example.webclass.model;

public class User {
    private Long id;
    private String name; // 对应数据库 'name' 字段
    private String passw; // 对应数据库 'passw' 字段 (注意：通常不在返回给前端的User对象中包含密码)

    // Constructors
    public User() {
    }

    public User(Long id, String name, String passw) {
        this.id = id;
        this.name = name;
        this.passw = passw;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}