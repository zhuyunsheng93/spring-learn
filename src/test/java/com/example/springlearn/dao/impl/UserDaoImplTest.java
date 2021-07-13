package com.example.springlearn.dao.impl;

import com.example.springlearn.dao.UserDao;
import junit.framework.TestCase;
import org.junit.Test;
import org.mybatis.logging.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.File;
import java.util.logging.Logger;

/**
 *  *@Description          
 *  *@Author  zhuyunsheng       //作者
 *  *@Date 2021/7/13 15:42      //创建时间
 **/
public class UserDaoImplTest {



    @Test
    public void triditionalWay(){
     UserDaoImpl userDao = new UserDaoImpl();
    // userDao.setName("test");
     userDao.save();
    }
    @Test
    public void testSave() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();
    }
    @Test
    public void testSave1() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:\\practicesource\\applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();
    }
}