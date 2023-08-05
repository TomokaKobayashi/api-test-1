package com.chandla.apitest1.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi1 {
    @GetMapping("/api/test1")
    public String doAction(){
      return "Hello world!";  
    }
}
