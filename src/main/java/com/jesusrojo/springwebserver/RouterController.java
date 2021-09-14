package com.jesusrojo.springwebserver;

import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
public class RouterController {

    @RequestMapping("/")
    public String helloWorld(){
        return "Hello World from Spring Boot";
    }

    @RequestMapping("/goodbye")
    public String goodbyeWorld(){
        return "Goodbye from Spring Boot";
    }


    @RequestMapping("/a")
    public String routeA(){
        return "aaaaaaaaaaaaaaa";
    }

    @RequestMapping("/b")
    public String[] routeB(){return new String[]{"red","yellow", "green"};}

    @RequestMapping("/c")
    public List<String> routeC() {
        List<String> results = new ArrayList<>();
        results.add("Rojo");
        results.add("Amarillo");
        results.add("Verde");
        return results;
    }
}