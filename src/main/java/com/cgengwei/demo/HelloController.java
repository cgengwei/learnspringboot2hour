package com.cgengwei.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cgengwei
 * 2018/5/5 08:33
 */
@RestController
public class HelloController {

    @Value("${config1}")
    private String param;

    @Value("${config2}")
    private String param2;

    @Autowired
    private MyConfig myConfig;

    @RequestMapping(value = "/hello",method = {RequestMethod.GET,RequestMethod.POST})
    public String sayHello(){
//        return "Hello , " + param;
//        return param2;
        return myConfig.toString();
    }

}
