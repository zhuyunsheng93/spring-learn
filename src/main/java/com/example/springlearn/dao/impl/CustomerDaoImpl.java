package com.example.springlearn.dao.impl;

import com.example.springlearn.dao.CustomerDao;

/**
 *  *@Description          
 *  *@Author  zhuyunsheng       //作者
 *  *@Date 2021/7/13 16:40      //创建时间
 **/
public class CustomerDaoImpl implements CustomerDao {
    public void setup() {
        System.out.println("CustomerDaoImpl被初始化了......");
    }
    @Override
    public void save() {
        System.out.println("CustomerDaoImpl中的save方法执行了......");
    }
    /*
     * 工厂被关闭之后，才会调用该方法
     */
    public void destroy() {
        System.out.println("CustomerDaoImpl被销毁了......");
    }
}
