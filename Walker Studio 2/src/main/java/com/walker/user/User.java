package com.walker.user;

import java.util.Objects;

public class User {
    private String name;
    private String id;
    private String password;

    private User(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }


    public static User createUser(String name, String id, String password) {
        return new User(name, id, password);
    }



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
