package com.example.springlearn.aop.proxy;

import com.example.springlearn.aop.demo2.CustomerDao;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *  *@Description          
 *  *@Author  zhuyunsheng       //作者
 *  *@Date 2021/7/14 16:10      //创建时间
 * //一旦CglibProxy这个类实现了MethodInterceptor接口，那么这个类就相当于InvocationHandler
 **/
public class CglibProxy implements MethodInterceptor {
    private CustomerDao customerDao;

    public CglibProxy(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public CustomerDao createCglibProxy() {
         //1.创建Cglib的核心类的对象
        Enhancer enhancer = new Enhancer();
        //2.给它设置父类
        enhancer.setSuperclass(customerDao.getClass());
        //3.设置回调（回调类似于InvocationHandler对象）
        enhancer.setCallback(this);
        //4.创建代理对象
        CustomerDao proxy = (CustomerDao) enhancer.create();
        return proxy;
    }
    /*
     * proxy：即CustomerDao的代理对象，也即它的子类。
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        //判断方法名是不是save？
        if ("save".equals(method.getName())) {
            //增强save方法，进行一个权限校验
            System.out.println("权限校验~~~~~~~~~~~~~~~~");
            return methodProxy.invokeSuper(proxy, args);
        }
        //如果不是save方法，那么执行子类的父类里面的方法（父类里面的方法是没有增强的）
        return methodProxy.invokeSuper(proxy, args);
    }
}
