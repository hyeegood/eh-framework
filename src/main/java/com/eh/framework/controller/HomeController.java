package com.eh.framework.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController extends CommonController {
	
	@GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("msg", "Hello Spring MVC Framework!");
        return "home"; // /WEB-INF/views/home.jsp
    }
}
