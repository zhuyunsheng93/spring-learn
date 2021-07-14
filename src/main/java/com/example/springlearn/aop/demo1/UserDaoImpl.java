package com.example.springlearn.aop.demo1;

/**
 *  *@Description          
 *  *@Author  zhuyunsheng       //作者
 *  *@Date 2021/7/14 16:00      //创建时间
 **/
public class UserDaoImpl implements UserDao{
    @Override
    public void save() {
        System.out.println("保存用户......");
    }

    @Override
    public void update() {
        System.out.println("修改用户......");
    }

    @Override
    public void find() {
        System.out.println("查询用户......");
    }

    @Override
    public void delete() {
        System.out.println("删除用户......");
    }

}
