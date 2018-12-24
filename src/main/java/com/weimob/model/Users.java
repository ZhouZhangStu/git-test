package com.weimob.model;

public class Users {
    private byte[] id;

    private String username;

    private String password;

    public Users(byte[] id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Users() {
        super();
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}