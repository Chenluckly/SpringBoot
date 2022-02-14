package com.wanghu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wanghu
 * @date 2022/1/7 17:07
 */
@Controller
public class HelloSpringBoot {

    @RequestMapping("/hello")
    @ResponseBody
    private String Hello(){
        return "欢迎使用SpringBoot框架";
    }
}
