package com.example.springlearn.demo3;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  *@Description          
 *  *@Author  zhuyunsheng       //作者
 *  *@Date 2021/7/13 17:19      //创建时间
 **/
public class Bean1Test  {
 @Test
    public void createBean(){
     ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
     applicationContext.getBean("bean1");
     System.out.println(applicationContext.getBean("bean1")==applicationContext.getBean("bean2"));
 }
}