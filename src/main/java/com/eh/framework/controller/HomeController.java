package com.eh.framework.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("msg", "Hello Spring MVC Framework!");
        return "home"; // /WEB-INF/views/home.jsp
    }
}
