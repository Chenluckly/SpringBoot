package com.wanghu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wanghu
 * @date 2022/1/9 22:02
 */
@Controller
public class CustomFilterController {


    @RequestMapping("user/account")
    @ResponseBody
    public String  UserAccount(){
        return "user/account";
    }


    @RequestMapping("/query")
    @ResponseBody
    public String  UserQuery(){
        return "/query";
    }

}
