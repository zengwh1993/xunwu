package com.hellotiger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: helloTiger
 * @Date: 2018/12/27 09:36
 * @Description:
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public  String index(){
        return "index";
    }
}
