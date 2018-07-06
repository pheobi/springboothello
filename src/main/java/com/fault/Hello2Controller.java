package com.fault;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2Controller {

    @RequestMapping("hello3")
    public String hello3() {
        return "启动类须在同包或上级包下 否则404";
    }
}
