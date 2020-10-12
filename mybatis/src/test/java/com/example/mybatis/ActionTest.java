package com.example.mybatis;

import com.alibaba.fastjson.JSONObject;
import com.example.mybatis.dao.UserMapper;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = MybatisApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("dev")
public class ActionTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void t() {
//        JSONObject.toJSONString(userMapper.getActionList());
        System.out.println(JSONObject.toJSONString(userMapper.selectAll(1L)));
        System.out.println(JSONObject.toJSONString(userMapper.selectAll(1L)));
    }
}
