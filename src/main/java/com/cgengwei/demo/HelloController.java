package com.cgengwei.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cgengwei
 * 2018/5/5 08:33
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello",method = {RequestMethod.GET,RequestMethod.POST})
    public String sayHello(){
        return "Hello Spring Boot!!";
    }


}
