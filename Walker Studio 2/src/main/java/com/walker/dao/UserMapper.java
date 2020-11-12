package com.walker.dao;

import com.walker.user.User;

import java.util.List;

public interface UserMapper {


    List<User> getUsers();

    User getUserById(String id);

    int addUser(User user);
//    void addUser(String name, String id, String password);
    //void addUsers(List<User> users);

    void deleteUser(String id);
    void updateUser(User user);
}
