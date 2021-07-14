package com.example.springlearn.service.impl;

import com.example.springlearn.dao.UserDao;
import com.example.springlearn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  *@Description          
 *  *@Author  zhuyunsheng       //作者
 *  *@Date 2021/7/14 11:21      //创建时间
 **/
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void save() {
        userDao.save();
    }
}
