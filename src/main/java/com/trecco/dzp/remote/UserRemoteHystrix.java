package com.trecco.dzp.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class UserRemoteHystrix implements UserRemote {

    @Override
    public String findUserByIdCard(@RequestParam(value = "idCard") String idCard) {
        return "this message send failed";
    }
}
