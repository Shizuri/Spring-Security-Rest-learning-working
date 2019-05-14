package com.z.ui;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class Controller {

    @GetMapping("/resource")
    public Map<String, Object> home(){
        Map<String, Object> model = new HashMap<>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello World");
        return model;
    }

    @GetMapping("/resource2")
    public Map<String, Object> home2(){
        Map<String, Object> model = new HashMap<>();
        model.put("id", "ZA ADMIN: " + UUID.randomUUID().toString());
        model.put("content", "Hello World");
        return model;
    }
}
