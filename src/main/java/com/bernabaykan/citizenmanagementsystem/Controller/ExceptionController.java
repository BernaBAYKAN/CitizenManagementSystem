package com.bernabaykan.citizenmanagementsystem.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class ExceptionController {

    @RequestMapping("/test")
    public String test() {
        throw new RuntimeException("Test exception");
    }
}
