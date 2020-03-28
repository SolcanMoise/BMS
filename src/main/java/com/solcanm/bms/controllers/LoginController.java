package com.solcanm.bms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/")
    public String login(Model model) {
        model.addAttribute("title", "BMS");
        return "login";
    }
}
