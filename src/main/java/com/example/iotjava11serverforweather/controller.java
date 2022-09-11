package com.example.iotjava11serverforweather;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/")
    public String getStr () {
        return "<h1>HEllO</h1>";
    }
}
