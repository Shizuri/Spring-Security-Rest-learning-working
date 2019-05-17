package com.z.ui;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class Controller {

    @RequestMapping("/resource")
    public Map<String, Object> home(){
        Map<String, Object> model = new HashMap<>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello World");
        return model;
    }

    @RequestMapping("/resource2")
    public Map<String, Object> home2(){
        Map<String, Object> model = new HashMap<>();
        model.put("id", "ZA ADMIN: " + UUID.randomUUID().toString());
        model.put("content", "Hello World");
        return model;
    }

    @RequestMapping("/login")
    public boolean login(){
        return true;
    }

    @PostMapping("/test")
    public String test(@RequestBody String value){
        System.out.println(value);
        String encoded = encoder().encode(value);
        System.out.println(encoded);
        System.out.println(encoder().matches(value, encoded));

        System.out.println();
        String encoded2 = encoder().encode("blah");
        System.out.println(encoder().matches(value, encoded2));
        return value;
    }

    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }
}
