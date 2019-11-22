package com.zyh.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Account implements Serializable //实现序例化接口
{
    private String username;
    private String password;
    private double money;

    // 添加了User引用类型，建立其get，set，toString方法，并新建User引用类，
    // 同理操作即可
    // private User user;

    private List<User> list;
    private Map<String, User> map;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    // public User getUser() {
    //     return user;
    // }
    //
    // public void setUser(User user) {
    //     this.user = user;
    // }


    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
