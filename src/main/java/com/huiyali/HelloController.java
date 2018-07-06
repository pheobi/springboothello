package com.huiyali;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 在这里使用restController (等价于@Controller 和 @ResponseBody)
 *@Author:YahuiLi
 *@Description:
 *@Date:17:39 2018/6/19
 */
@RestController
public class HelloController {

    /**
     * 在这里我们使用@RequestMapping 建立请求映射：
     *
    *@Author:YahuiLi
    *@Description:
    *@param
    *@Date:17:47 2018/6/19
    */
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
    /**
     * 返回格式是json
     * Spring Boot默认使用的json解析框架是jackson
    *@Author:YahuiLi
    *@Description:
    *@param
    *@Date:15:39 2018/6/20
    */
    @RequestMapping("/demo")
    public Demo getDemo(){
        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("戴某1");
        demo.setCreateTime(new Date());
        return  demo;
    }
}
