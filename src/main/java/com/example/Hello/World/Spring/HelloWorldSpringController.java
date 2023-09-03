package com.example.Hello.World.Spring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldSpringController {
    @RequestMapping("/")
    public String helloWorld() {
        return "Hello World from Spring Boot !";
    }

    @RequestMapping("/goodbye")
    public String goodbye() {
        return "Goodbye from Spring Boot !";
    }

    @RequestMapping("/id/{id}")
    public String getId(@PathVariable Integer id) {
        return "The given ID is: " + id + ".";
    }

    @RequestMapping("/greet/{name}")
    public String getId(@PathVariable String name) {
        return "Hello " + name + ".";
    }
}