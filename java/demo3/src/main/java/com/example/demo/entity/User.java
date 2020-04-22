package com.example.demo.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2020-04-17 14:57:33
 */
public class User implements Serializable {
    private static final long serialVersionUID = 502045674378156781L;
    
    private Integer id;
    
    private String name;
    
    private Double leftmoney;
    
    private String password;


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

    public Double getLeftmoney() {
        return leftmoney;
    }

    public void setLeftmoney(Double leftmoney) {
        this.leftmoney = leftmoney;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}