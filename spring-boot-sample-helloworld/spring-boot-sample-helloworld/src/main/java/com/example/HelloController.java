package com.example;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by richard on 2017/9/24.
 */
@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/")
    public String helloWorld(){
        System.out.println("进入controller，hello world");
        return "Hello world!";
    }

    @RequestMapping("/hello/{name}")
    public String hellName(@PathVariable("name") String name){

        System.out.println("进入controller，PathVariable");
        return "Hello "+name;
    }
}
