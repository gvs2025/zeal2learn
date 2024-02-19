package com.zeal2learn.orms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/hello")
    public String hello() {
        return "hello"; // This returns the logical view name
    }
}
