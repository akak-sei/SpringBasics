package com.kak.springbasics.web.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by akak on 2/19/2016.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "offersHome")
    public String showHome () {
        return "home";
    }
}
