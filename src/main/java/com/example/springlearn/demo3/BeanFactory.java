package com.example.springlearn.demo3;

/**
 *  *@Description          
 *  *@Author  zhuyunsheng       //作者
 *  *@Date 2021/7/13 17:31      //创建时间
 **/
public class BeanFactory {
    public static Bean2 createBean2() {
        System.out.println("Bean2Factory中的方法执行了......");
        return new Bean2();
    }
}
