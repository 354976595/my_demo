package com.example.springdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = SpringdemoApplication.class)
@ActiveProfiles("dev")

class SpringdemoApplicationTests {

    @Test
    void contextLoads() {
    }

}
