package com.zyh.controller;

import com.zyh.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 请求参数绑定
 */
@Controller
@RequestMapping(value = "/param")
public class ParamController {
    /**
     * 请求参数绑定用户密码
     *
     * @return
     */
    @RequestMapping("/testParam")
    public String testParam(String username, int password) {
        System.out.println("绑定执行……");
        System.out.println("用户名：" + username);
        System.out.println("密码：" + password);
        return "success";
    }

    /**
     * 保存用户密码
     * 把数据封装到JavaBean类当中
     *
     * @return
     */
/*
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account) //param.jsp页面下的数据会默认封装到account对象当中
    {
        System.out.println("保存执行……");
        System.out.println(account);
        return "success";
    }
*/
    @RequestMapping("/saveAccount")
    public String saveAccount(String username, String password, Map map) {
        System.out.println("username:" + username);
        System.out.println("password:" + password);
        map.put("name", username);
        map.put("password", password);
        return "success";
    }
}
