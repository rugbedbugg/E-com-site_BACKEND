package com.rugbedbugg.E_com_site_BACKEND.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController  // Returns data | Modern way ->> Shortcut for @Controller and @ResponseBody
//@Controller      // Returns a webpage (view) unless @ResponseBody is added
public class HomeController {

    @RequestMapping("/")
    //@ResponseBody
    public String greet() {
        // After reading @Controller, Spring starts looking for a page named "Welcome to my first project in SpringBoot"
        // We dont want to have such a page, so we use @ResponseBody to specify
        // That we only want to return the data
        return "Welcome to my first project in SpringBoot";
    }

    @RequestMapping("/about")
    public String about() {
        return "Hello, I'm Partha. Nice to meet you";
    }
}
