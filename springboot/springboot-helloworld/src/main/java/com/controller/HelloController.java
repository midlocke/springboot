package com.controller;

import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by richard on 2017/9/24.
 */
@RestController
@EnableAutoConfiguration
public class HelloController {

    private Logger LOGGER = Logger.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String index(){

        LOGGER.error("日志打印");
        System.out.println("进入controller");
        return "Hello World!";
    }
}
