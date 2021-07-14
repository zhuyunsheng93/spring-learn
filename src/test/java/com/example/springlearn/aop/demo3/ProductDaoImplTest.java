package com.example.springlearn.aop.demo3;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  *@Description          
 *  *@Author  zhuyunsheng       //作者
 *  *@Date 2021/7/14 17:03      //创建时间
 **/
public class ProductDaoImplTest {
    @Test
    public void testSave() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductDao productDao = (ProductDao) context.getBean("aopProductDao");
        productDao.save();
        productDao.update();
        productDao.find();
        productDao.delete();
    }
}