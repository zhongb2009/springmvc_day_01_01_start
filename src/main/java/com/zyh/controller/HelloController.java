package com.zyh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//控制器
@Controller
@RequestMapping("/user")
public class HelloController {

    /**
     * 入门案例
     *
     * @return
     */
    @RequestMapping("/hello")
    public String sayHello() {
        System.out.println("Hello SpringMVC!");
        return "success";
    }

    /**
     * RequestMapping注解
     *
     * @return
     */
    @RequestMapping(value = "/testRequestMapping", method = {RequestMethod.GET}, params = "money!=100", headers = {"Accept"})
    public String testRequestMapping() {
        System.out.println("测试RequestMapping注解!");
        return "success";
    }


}
