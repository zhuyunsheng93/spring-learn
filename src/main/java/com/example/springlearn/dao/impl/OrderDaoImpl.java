package com.example.springlearn.dao.impl;

import com.example.springlearn.dao.OrderDao;

/**
 *  *@Description          
 *  *@Author  zhuyunsheng       //作者
 *  *@Date 2021/7/14 14:30      //创建时间
 **/
public class OrderDaoImpl implements OrderDao {
    @Override
    public void save() {
        System.out.println("OrderDao中的save方法执行了......");
    }
}
