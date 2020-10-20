package com.example.springdemo.cnf;


import com.example.springdemo.filter.RequstFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConf {
    @Bean
    public FilterRegistrationBean reqResFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        RequstFilter reqResFilter = new RequstFilter();
        filterRegistrationBean.setFilter(reqResFilter);
        filterRegistrationBean.addUrlPatterns("*.json");
//配置过滤规则
        return filterRegistrationBean;
    }
}
