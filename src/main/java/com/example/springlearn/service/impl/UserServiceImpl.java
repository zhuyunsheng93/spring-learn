package com.example.springlearn.service.impl;

import com.example.springlearn.dao.UserDao;
import com.example.springlearn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *  *@Description          
 *  *@Author  zhuyunsheng       //作者
 *  *@Date 2021/7/14 11:21      //创建时间
 **/
@Service("userService")
//@Scope() singleton,prototype,request session
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @PostConstruct ////相当于我们配置的init-method="init
    public void init() {
        System.out.println("userServiceImpl初始化");
    }
    @PreDestroy ////相当于我们配置的destroy-method="destroy",单例模式情况下才可以调用到
    public void destroy(){
        System.out.println("userServiceImpl销毁");
    }

    @Override
    public void save() {
        userDao.save();
    }
}
