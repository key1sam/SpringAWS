package com.example.springaws.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 컨트롤러를 JSON을 반환하는 컨트롤러로 만ㄷ르어 줌.
public class HelloController { 
    @GetMapping("/hello") // http Get 요청을 받을 수 있는 api 생성
    public String hello() {
        return "hello";
    }
}
