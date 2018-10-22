package com.hpe.eurekaconsumer2.controller;


import com.hpe.eurekaconsumer2.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private HelloService helloService;

    @Value("${server.port}")
    String port;

    @RequestMapping("/test")
    public String home(@RequestParam String name) {
        System.out.println("consumer"+name+",i am from port:" +port);
        User usr = helloService.feignToClientByName(name);
        return usr.getUseName()+":"+"consumer"+name+",i am from port:" +port;
    }

    @RequestMapping("/test2")
    public String home2(@RequestParam String name) {
        System.out.println("consumer"+name+",i am from port:" +port);
        User usr = helloService.feignToClientByName2(name);
        return usr.getUseName();
    }
}
