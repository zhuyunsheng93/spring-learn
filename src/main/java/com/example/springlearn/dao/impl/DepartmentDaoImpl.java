package com.example.springlearn.dao.impl;

import com.example.springlearn.dao.DepartmentDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *  *@Description          
 *  *@Author  zhuyunsheng       //作者
 *  *@Date 2021/7/14 10:58      //创建时间
 **/
@Component("departmentDao") //写了这个注解，相当于在applicationContext.xml 配置了<bean id ="departmentDao" class = ""/>
//@Repository 和上面的相同的效果
public class DepartmentDaoImpl  implements DepartmentDao {

    @Value("管理部")
    private String name;

    @Override
    public void save() {
        System.out.println("DepartmentDaoImpl的save方法执行了....." + name);
    }
}
