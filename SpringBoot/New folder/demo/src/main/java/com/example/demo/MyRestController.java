package com.example.demo2;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @GetMapping("/greeting")
    private String sayHello() {
        return "Hello";
    }

    @PostMapping("/postreq")
    private String postRequest() {
        return "This response is from post";
    }

    @PutMapping("/putreq")
    private String putRequest() {
        return "This response is from put";
    }

    @DeleteMapping("/deletereq")
    private String deleteRequest() {
        return "This response is from delete";
    }

}
