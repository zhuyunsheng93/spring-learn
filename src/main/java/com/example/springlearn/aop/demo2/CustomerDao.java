package com.example.springlearn.aop.demo2;

/**
 *  *@Description          
 *  *@Author  zhuyunsheng       //作者
 *  *@Date 2021/7/14 16:09      //创建时间
 **/
public class CustomerDao {
    public void save() {
        System.out.println("保存客户......");
    }

    public void update() {
        System.out.println("修改客户......");
    }

    public void find() {
        System.out.println("查询客户......");
    }

    public void delete() {
        System.out.println("删除客户......");
    }

}
