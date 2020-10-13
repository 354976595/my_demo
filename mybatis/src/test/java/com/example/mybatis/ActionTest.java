package com.example.mybatis;

import com.alibaba.fastjson.JSONObject;
import com.example.mybatis.dao.UserMapper;
import com.example.mybatis.entity.Action;
import com.example.mybatis.service.IUserService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest(classes = MybatisApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("dev")
public class ActionTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private IUserService userService;
    @Test
    public void t() {
//        JSONObject.toJSONString(userMapper.getActionList());
        System.out.println(JSONObject.toJSONString(userMapper.selectAll(1L)));
        System.out.println(JSONObject.toJSONString(userMapper.selectAll(1L)));
    }
    @Test
    //测试mybatis事物
    public void testTransaction() throws Exception {
        userService.updateAction();
    }
    @Test
    //测试一对一 一对多 1
    public void testCollection1(){
        System.out.println(JSONObject.toJSONString(userMapper.testCollection()));

    }

    @Test
    //测试一对一 一对多 2
    public void testCollection2(){
        System.out.println(JSONObject.toJSONString(userMapper.testCollection2()));

    }

    /**
     * xml 标签 动态sql
     */
    @Test
    public void testDymicsql(){
        Action action=new Action();
        List add = new ArrayList<>();
        add.add(1l);
        action.setActionName("测试导入");
        action.setPrimaryId(add);
        System.out.println(JSONObject.toJSONString(userMapper.getDynamicsql(action)));
    }
}
