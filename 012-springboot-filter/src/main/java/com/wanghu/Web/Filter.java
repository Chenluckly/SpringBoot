package com.wanghu.Web;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author wanghu
 * @date 2022/1/9 21:46
 */
//自定义过滤器
public class Filter implements javax.servlet.Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        javax.servlet.Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("执行了Filter，doFilter");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        javax.servlet.Filter.super.destroy();
    }
}
