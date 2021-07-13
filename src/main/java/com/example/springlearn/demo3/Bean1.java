package com.example.springlearn.demo3;

/**
 *  *@Description          
 *  *@Author  zhuyunsheng       //作者
 *  *@Date 2021/7/13 17:15      //创建时间
 **/
public class Bean1 {
    private String name;
    public Bean1(String name){
        this.name = name;
        System.out.println("Bean1的有参构造方法执行了");
    }
    public Bean1(){
        System.out.println("Bean1的无参构造方法执行了.......");
    }
}
