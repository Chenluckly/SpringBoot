package com.bjpowernode;

import com.bjpowernode.config.SpringConfig;
import com.bjpowernode.vo.Cat;
import com.bjpowernode.vo.Student;
import com.bjpowernode.vo.Tiger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class MyTest {

    /**
     * 使用xml作为容器配置文件
     */
    @Test
    public void test01(){
        String config="beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        Student bean = ctx.getBean(Student.class);
        Student student = (Student) ctx.getBean("myStudent");
        System.out.println("容器中的对象："+student);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Cat.class,Student.class,Tiger.class,SpringConfig.class);
        int beanDefinitionCount = applicationContext.getBeanDefinitionCount();
        System.out.println(beanDefinitionCount);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String b:beanDefinitionNames){
            System.out.println(b);
        }
    }


    /**
     * 使用JavaConfig
     */
    @Test
    public void test02(){
        ApplicationContext ctx  = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) ctx.getBean("createStudent");
        System.out.println("使用JavaConfig创建的bean对象："+student);
    }

    @Test
    public void test03(){
        ApplicationContext ctx  = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) ctx.getBean("lisiStudent");
        System.out.println("使用JavaConfig创建的bean对象："+student);
    }


    @Test
    public void test04(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Cat cat  = (Cat) ctx.getBean("myCat");
        System.out.println("cat=="+cat);
    }

    @Test
    public void test05(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
       Tiger tiger = (Tiger) ctx.getBean("tiger");
        System.out.println("tiger=="+tiger);
    }
}