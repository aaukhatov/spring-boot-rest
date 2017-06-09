package com.aukhatov.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Redirect to swagger index.html
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "redirect:/index.html";
    }
}
