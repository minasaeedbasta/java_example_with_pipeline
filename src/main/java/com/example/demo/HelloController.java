package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for handling API requests.
 */
@RestController
@RequestMapping("/api")
public final class HelloController {
    /**
     * Returns a greeting message.
     *
     * @return Greeting message.
     */
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, DevOps!";
    }

    /**
     * Returns another greeting message.
     *
     * @return Greeting message.
     */
    @GetMapping("/hi")
    public String sayHi() {
        return "Hi, DevOps!";
    }

    /**
     * Returns another greeting message.
     *
     * @return Greeting message.
     */
    @GetMapping("/usa")
    public String sayHiToUSA() {
        return "Uncle sam";
    }

    /**
     * Returns another greeting message.
     *
     * @return Greeting message.
     */
    @GetMapping("/byebye")
    public String sayByeBye() {
        return "Buy Buy";
    }
}
