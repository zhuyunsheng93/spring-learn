package com.example.springlearn.dao.impl;

import com.example.springlearn.dao.CustomerDao;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  *@Description          
 *  *@Author  zhuyunsheng       //作者
 *  *@Date 2021/7/13 16:44      //创建时间
 **/
public class CustomerDaoImplTest {
    @Test
    public void testSave() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDao");
        customerDao.save();
        applicationContext.close();
    }
    @Test
    public void testLifeCycle(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDao customerDao1 = (CustomerDao) applicationContext.getBean("customerDao");
        System.out.println(customerDao1);
        CustomerDao customerDao2 = (CustomerDao) applicationContext.getBean("customerDao");
        System.out.println(customerDao2);
        System.out.println(customerDao1 == customerDao2);//true，bean默认即单例创建
        applicationContext.close();

    }
}