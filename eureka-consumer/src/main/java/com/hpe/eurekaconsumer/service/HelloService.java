package com.hpe.eurekaconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "service-hi")
public interface HelloService {
    @GetMapping("/hi")
    public String feignToClientByName(@RequestParam("name") String name);

    @GetMapping("/hi2")
    public String feignToClientByName2(@RequestParam("name") String name);
}
