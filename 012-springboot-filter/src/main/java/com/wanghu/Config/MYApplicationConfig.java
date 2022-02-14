package com.wanghu.Config;

import com.wanghu.Web.Filter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;

/**
 * @author wanghu
 * @date 2022/1/9 21:55
 */
@Configuration
public class MYApplicationConfig {

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean();
        filterFilterRegistrationBean.setFilter(new Filter());
        filterFilterRegistrationBean.addUrlPatterns("/user/*");
        return filterFilterRegistrationBean;
    }
}
