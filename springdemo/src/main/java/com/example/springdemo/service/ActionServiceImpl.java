package com.example.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActionServiceImpl implements IActionService {
    private String actionname;
    private int age;
    @Override
    public void aopMethod(String request1,Integer request2,Object request3) {
        System.out.println("aopMethod invocation");
        System.out.println(request1);
        System.out.println(request2);
        System.out.println(request3);
    }
}
