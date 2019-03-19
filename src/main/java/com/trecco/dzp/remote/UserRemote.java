package com.trecco.dzp.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "spring-cloud-producer", fallback = UserRemoteHystrix.class)
public interface UserRemote {
    @RequestMapping(value = "/findByIdCard")
    public String findUserByIdCard(@RequestParam(value = "idCard") String idCard);
}
