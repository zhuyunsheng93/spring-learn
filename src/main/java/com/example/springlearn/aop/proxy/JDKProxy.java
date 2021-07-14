package com.example.springlearn.aop.proxy;

import com.example.springlearn.aop.demo1.UserDao;

import javax.annotation.Resource;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *  *@Description          
 *  *@Author  zhuyunsheng       //作者
 *  *@Date 2021/7/14 16:01      //创建时间
 * 使用JDK的动态代理机制来对UserDao产生代理
 **/
public class JDKProxy implements InvocationHandler {
    @Resource
    private UserDao userDao;

    public JDKProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao crateProxy() {
        UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(), userDao.getClass().getInterfaces(), this);
        return userDaoProxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("save".equals(method.getName())){
            System.out.println("权限校验");
            method.invoke(userDao,args);
        }
        return method.invoke(userDao,args);
    }
}
