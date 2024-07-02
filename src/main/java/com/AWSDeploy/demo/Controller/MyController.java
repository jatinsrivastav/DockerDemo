package com.AWSDeploy.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/me")
    public String mymethod(){
        return "this is AWs deployment";


    }
}
