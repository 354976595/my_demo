package com.example.springdemo;

import com.example.springdemo.cnf.BeanSetting;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = SpringdemoApplication.class)
@ActiveProfiles("dev")

public class SpringdemoApplicationTests {
@Autowired
private BeanSetting beanSetting;
@Autowired
private JavaMailSenderImpl
     javaMailSender;
    @Test
   public void contextLoads() {
        System.out.println(beanSetting);
    }
    @Test
    public void testMail(){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("11111通知-明天来狂神这听课");
        message.setText("今晚7:30开会");
        message.setTo("354976595.love@163.com");
        message.setFrom("354976595.love@163.com");
        javaMailSender.send(message);
    }

}
