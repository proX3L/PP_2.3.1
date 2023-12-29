package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    User getUser(int id);
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUser(int id);
}