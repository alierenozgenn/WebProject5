package com.foy5.foy5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("message", "Kullanıcı Yönetim Sayfasına Hoşgeldiniz");
        return "index"; 
    }
}
