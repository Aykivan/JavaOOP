package example.controller;

import example.model.User;
import example.service.UserService;

public class UserController {
    UserService userService = new UserService();
    public void saveNewUser(Integer id, String name, int age) {
        userService.saveUser(new User(id, name, age));
    }

    public void deleteUser(User user) {
        userService.deleteFromRepo(user);
    }

    public User getUser(User user){
        return userService.getUserFromRepo(user);
    }

    public void addUserToRepo(User user){
        userService.addUserToRepo(user);
    }
}
