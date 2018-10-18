package com.hpe.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public User home(@RequestParam String name) {
        User user = new User();
        user.setUsrId(1);
        user.setUseName("hi "+name+",i am from port:" +port);
        return user;
    }

    @RequestMapping("/hi2")
    public User home2(@RequestParam String name) {
        User user = new User();
        user.setUsrId(2);
        user.setUseName("h2 "+name+",i am from port:" +port);
        return user;
    }
}
