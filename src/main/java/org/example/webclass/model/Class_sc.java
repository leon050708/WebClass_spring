package org.example.webclass.model;

public class Class_sc {
    private Long id;
    private String class_code ;
    private String class_name ;
    private String class_time ;
    private String class_score ;
    private String class_begin ;
    private String class_type ;
    private String class_info ;

    public Class_sc(Long id, String class_code, String class_name, String class_time, String class_score, String class_begin, String class_type, String class_info) {
        this.id = id;
        this.class_code = class_code;
        this.class_name = class_name;
        this.class_time = class_time;
        this.class_score = class_score;
        this.class_begin = class_begin;
        this.class_type = class_type;
        this.class_info = class_info;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClass_code() {
        return class_code;
    }

    public void setClass_code(String class_code) {
        this.class_code = class_code;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getClass_time() {
        return class_time;
    }

    public void setClass_time(String class_time) {
        this.class_time = class_time;
    }

    public String getClass_score() {
        return class_score;
    }

    public void setClass_score(String class_score) {
        this.class_score = class_score;
    }

    public String getClass_begin() {
        return class_begin;
    }

    public void setClass_begin(String class_begin) {
        this.class_begin = class_begin;
    }

    public String getClass_type() {
        return class_type;
    }

    public void setClass_type(String class_type) {
        this.class_type = class_type;
    }

    public String getClass_info() {
        return class_info;
    }

    public void setClass_info(String class_info) {
        this.class_info = class_info;
    }

    @Override
    public String toString() {
        return "Class_sc{" +
                "id=" + id +
                ", class_code='" + class_code + '\'' +
                ", class_name='" + class_name + '\'' +
                ", class_time='" + class_time + '\'' +
                ", class_score='" + class_score + '\'' +
                ", class_begin='" + class_begin + '\'' +
                ", class_type='" + class_type + '\'' +
                ", class_info='" + class_info + '\'' +
                '}';
    }
}
