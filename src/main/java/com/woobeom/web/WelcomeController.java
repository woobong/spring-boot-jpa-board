package com.woobeom.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by ETHAN on 2017-06-26.
 */
@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String helloWorld(String name, String age, Model model) {

        model.addAttribute("name", name);
        model.addAttribute("age", age);

        return "welcome";
    }

}
