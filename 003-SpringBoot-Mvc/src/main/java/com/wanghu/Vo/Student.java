package com.wanghu.Vo;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;

/**
 * @author wanghu
 * @date 2022/1/7 19:06
 */
@Resource
public class Student {
    @Value("耗子")
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
