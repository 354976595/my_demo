package com.example.mybatis.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatis.dao.UserMapper;
import com.example.mybatis.entity.Action;
import com.example.mybatis.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, Action> implements IUserService {
    @Override
//    @Transactional(rollbackFor = Exception.class)
    public void updateAction() throws Exception {
        this.testTransLation();
        throw new Exception("dbq");

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void testTransLation() throws Exception {
        this.update(new UpdateWrapper<Action>()
                .lambda().eq(Action::getId,1L).set(Action::getActionName,"站姿握球夹胸1"));

    }


}
