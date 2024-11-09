package vn.ngotien.jobhunter.controller;

import org.springframework.web.bind.annotation.*;
import vn.ngotien.jobhunter.domain.User;
import vn.ngotien.jobhunter.service.UserService;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return this.userService.handleCreateUser(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable("id") long id) {
        this.userService.handleDeleteUser(id);
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable long id) {
        return this.userService.handleFindUserById(id);
    }

    @GetMapping("/user")
    public List<User> getUsers() {
        return this.userService.findAllUsers();
    }

    @PutMapping("/user")
    public void updateUser(@RequestBody User user) {
        this.userService.hanldleUpdateUser(user);
    }
}
