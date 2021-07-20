package com.example.springlearn.aop.demo3;

/**
 *  *@Description          
 *  *@Author  zhuyunsheng       //作者
 *  *@Date 2021/7/14 16:44      //创建时间
 **/
public class ProductDaoImpl implements ProductDao {
    @Override
    public void save() {
        System.out.println("保存商品......");
    }

    @Override
    public void update() {
        System.out.println("修改商品......");
    }

    @Override
    public void find() {
        System.out.println("查询商品......");
        int i  =10/0;
    }

//    @Override
//    public void delete() {
//        System.out.println("删除商品......");
//    }
    @Override
    public String delete() {
        System.out.println("删除商品......");
        return "delete product";

    }
}
