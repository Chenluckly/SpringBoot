package com.wanghu;

import com.wanghu.Controller.HelloSpringBoot;
import com.wanghu.Vo.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloSpringBoot.class,Student.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String c:beanDefinitionNames){
            System.out.println(c);
        }
        Student bean =(Student) applicationContext.getBean(Student.class);
        System.out.println(bean.getName());
    }

}
