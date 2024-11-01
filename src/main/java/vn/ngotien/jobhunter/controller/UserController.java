package vn.ngotien.jobhunter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.ngotien.jobhunter.domain.User;
import vn.ngotien.jobhunter.service.UserService;

@RestController

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/create")
    public String createUser() {
        User user = new User();
        user.setName("Ngo Anh Tien");
        user.setPassword("123456");
        user.setEmail("abc@gmail.com");
        this.userService.handleCreateUser(user);
        return "create user";
    }
}
