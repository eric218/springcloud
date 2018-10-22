package com.hpe.eurekaconsumer2.service;


import com.hpe.eurekaconsumer2.controller.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "service-hi")
public interface HelloService {
    @GetMapping("/hi")
    public User feignToClientByName(@RequestParam("name") String name);

    @GetMapping("/hi2")
    public User feignToClientByName2(@RequestParam("name") String name);
}
