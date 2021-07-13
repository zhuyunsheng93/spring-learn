package com.example.springlearn.demo3;

/**
 *  *@Description          
 *  *@Author  zhuyunsheng       //作者
 *  *@Date 2021/7/13 17:48      //创建时间
 **/
public class Bean3Factory {
    public Bean3 createBean3() {
        System.out.println("Bean3的实例工厂中的方法执行了......");
        return new Bean3();
    }
}
