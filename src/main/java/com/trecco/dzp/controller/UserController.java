package com.trecco.dzp.controller;

import com.trecco.dzp.remote.UserRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class UserController {

    @Autowired
    UserRemote userRemote;

    @Value("${eureka.url}")
    private String hello;

    @RequestMapping(value = "/findUserByIdCard/{idCard}", method = RequestMethod.GET)
    public String findUserByIdCard(@PathVariable("idCard") String idCard) {
        return userRemote.findUserByIdCard(idCard);
    }

    @RequestMapping("/hello")
    public String hi() {
        return this.hello;
    }

}