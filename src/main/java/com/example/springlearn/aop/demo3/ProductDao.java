package com.example.springlearn.aop.demo3;

import javafx.beans.binding.ObjectExpression;

/**
 *  *@Description          
 *  *@Author  zhuyunsheng       //作者
 *  *@Date 2021/7/14 16:44      //创建时间
 **/
public interface ProductDao {
    public void save();
    public void update();
    public void find();
    public String delete();
}
