package ru.greenlight.springboot.service;

import ru.greenlight.springboot.models.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> showAllUsers();

    User showUserById(int id);

    void updateUser(User updatedUser);

    void deleteUserById(int id);

}
