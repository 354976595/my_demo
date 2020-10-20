package com.example.springdemo;

import com.example.springdemo.cnf.BeanSetting;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = {"com.example"})
@ServletComponentScan
public class SpringdemoApplication
        implements InitializingBean

{

    public static void main(String[] args) {

        SpringApplication.run(SpringdemoApplication.class, args);
    }
    @Autowired
    private BeanSetting beanSetting;
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(beanSetting.toString());
    }
    @ConditionalOnMissingBean(BeanSetting.class )
    @Bean
    public BeanSetting getBeanSetting(){
        BeanSetting beanSetting=new BeanSetting();
        beanSetting.setAge(100);
        return beanSetting;
    }
}
