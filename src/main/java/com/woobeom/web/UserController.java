package com.woobeom.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ETHAN on 2017-06-26.
 */

@Controller
public class UserController {

    private List<User> users;

    {
        users = new ArrayList<>();
        users.add(new User("aaaa", "1234", "홍길동", "ghdrlfehd@gmail.com"));
        users.add(new User("bbbb", "1234", "이순신", "2tnstls@gmail.com"));
    }

    @PostMapping(value="/user")
    public String create(User user) {
        users.add(user);
        return "redirect:/user";
    }

    @GetMapping(value="/user")
    public String list(Model model) {
        model.addAttribute("users", users);
        return "list";
    }

}
