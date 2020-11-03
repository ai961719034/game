package com.ll.game.model.user;

import java.io.Serializable;

public class User4Login implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String username;

    private String password;

    private Integer userInfoId;

    public User4Login() {
    }

    public User4Login(Integer id, String username, String password, Integer userInfoId) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.userInfoId = userInfoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Integer getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Integer userInfoId) {
        this.userInfoId = userInfoId;
    }

    @Override
    public String toString() {
        return "User4Login{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userInfoId=" + userInfoId +
                '}';
    }
}
