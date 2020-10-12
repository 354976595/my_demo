package com.example.redis;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = RedisApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class RedisApplicationTests {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void contextLoads() {
        Object rs = redisTemplate.opsForValue().get("USER::CONSOLE::TOKEN::1426e7556e6bb26b25cb3a551fe8bceb");
        System.out.println(JSONObject.toJSONString(rs));
    }

}
