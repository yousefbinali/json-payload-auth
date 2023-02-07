package com.example.jsonpayloadauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HelloController
{
    @GetMapping("/hello")
    public String helloWithoutAuth()
    {
        return "Hello";
    }

    @GetMapping("/hello-auth")
    public String helloWithAuth(Principal p)
    {
        return "Hello " + p.getName();
    }
}
