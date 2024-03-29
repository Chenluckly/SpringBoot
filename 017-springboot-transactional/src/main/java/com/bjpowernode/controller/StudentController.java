package com.bjpowernode.controller;

import com.bjpowernode.model.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StudentController {

    @Resource
    private StudentService service;

    @RequestMapping("/addStudent")
    @ResponseBody
    public String addStudent(String username,Integer age){
        Student s1  = new Student();
        s1.setUsername(username);
        s1.setAge(age);

        int rows = service.addStudent(s1);
        return "添加学生："+rows;
    }


}
