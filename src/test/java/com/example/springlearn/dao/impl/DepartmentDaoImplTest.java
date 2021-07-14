package com.example.springlearn.dao.impl;

import com.example.springlearn.dao.DepartmentDao;
import com.example.springlearn.dao.UserDao;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  *@Description          
 *  *@Author  zhuyunsheng       //作者
 *  *@Date 2021/7/14 11:01      //创建时间
 **/
public class DepartmentDaoImplTest {
    /*
     * 传统方式
     */
    @Test
    public void demo01() {
        UserDao userDao = new UserDaoImpl();
        userDao.save();
    }

    /*
     * Spring的IOC的注解方式
     */
    @Test
    public void demo02() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        DepartmentDao userDao = (DepartmentDao) applicationContext.getBean("departmentDao");
        userDao.save();
    }
}