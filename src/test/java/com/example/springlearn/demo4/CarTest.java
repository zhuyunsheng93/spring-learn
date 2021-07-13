package com.example.springlearn.demo4;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CarTest {
    @Test
    public void testCar() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);
    }

    @Test
    public void testCar1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) applicationContext.getBean("car1");
        System.out.println(car);
    }
    /*
     * set方法注入对象的类型
     */
    @Test
    public void demo03() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee);
    }

}
