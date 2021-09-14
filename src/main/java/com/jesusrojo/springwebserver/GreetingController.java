package com.jesusrojo.springwebserver;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


// https://spring.io/guides/gs/rest-service/
// https://github.com/spring-guides/gs-rest-service/blob/main/complete/src/main/java/com/example/restservice/GreetingController.java
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // http://localhost:8080/greeting   // {"id":1,"content":"Hello, World!"}
    // http://localhost:8080/greeting?name=Peter  //{"id":2,"content":"Hello, Peter!"}
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}