package com.jansens.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/web/hello",method = RequestMethod.GET)
    public String hello(){
        //return restTemplate.getForEntity("http://localhost:8001/service/hello",String.class).getBody();
        return restTemplate.getForEntity("http://SPRINGCLOUD-SERVICE-PROVIDER/service/hello",String.class).getBody();
    }
}
