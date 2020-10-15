package com.hph.mysqlmybatis.entity;


public class User {
    private Long id;
    private String name;
    private String passwd;
    private String gender;
    private Integer age;

    public User() {
    }

    public User(Long id, String name, String passwd, String gender, Integer age) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
        this.gender = gender;
        this.age = age;
    }

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

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passwd='" + passwd + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
