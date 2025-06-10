package org.example.webclass.model;

public class Class {
    private Long id;
    private String class_num;
    private String class_code;
    private String class_name;
    private String class_place;
    private String class_type;

    public Class(Long id, String class_num, String class_code, String class_name, String class_place, String class_type) {
        this.id = id;
        this.class_num = class_num;
        this.class_code = class_code;
        this.class_name = class_name;
        this.class_place = class_place;
        this.class_type = class_type;
    }

    public Long getId() {
        return id;
    }

    public String getClass_num() {
        return class_num;
    }

    public String getClass_code() {
        return class_code;
    }

    public String getClass_name() {
        return class_name;
    }

    public String getClass_place() {
        return class_place;
    }

    public String getClass_type() {
        return class_type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setClass_num(String class_num) {
        this.class_num = class_num;
    }

    public void setClass_code(String class_code) {
        this.class_code = class_code;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public void setClass_place(String class_place) {
        this.class_place = class_place;
    }

    public void setClass_type(String class_type) {
        this.class_type = class_type;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", class_num='" + class_num + '\'' +
                ", class_code='" + class_code + '\'' +
                ", class_name='" + class_name + '\'' +
                ", class_place='" + class_place + '\'' +
                ", class_type='" + class_type + '\'' +
                '}';
    }
}
