package com.hongchai.entity;

public class User {
    private Integer id;
    private String name;
    private Float  leftmoney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getLeftmoney() {
        return leftmoney;
    }

    public void setLeftmoney(Float leftmoney) {
        this.leftmoney = leftmoney;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;
}
