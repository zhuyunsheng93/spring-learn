package com.example.springlearn.dao.impl;

import com.example.springlearn.dao.UserDao;
import org.springframework.stereotype.Service;

/**
 *  *@Description          
 *  *@Author  zhuyunsheng       //作者
 *  *@Date 2021/7/13 15:37      //创建时间
 **/

public class UserDaoImpl implements UserDao {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
  public void setUp(){
      System.out.println("UserDao初始化");
  }
  public void destroy(){
      System.out.println("UserDao 销毁");
  }
    @Override
    public void save() {
        System.out.println("UserDaoImpl中的save方法执行了......" + name);
    }
}
