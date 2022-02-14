package com.bjpowernode;

import com.bjpowernode.controller.JspController;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		String[] beanDefinitionNames = run.getBeanDefinitionNames();
		for(String b:beanDefinitionNames){
			System.out.println(b);
		}
		int beanDefinitionCount = run.getBeanDefinitionCount();
		System.out.println(beanDefinitionCount);
		JspController bean = run.getBean(JspController.class);
		System.out.println(bean);
	}

}
