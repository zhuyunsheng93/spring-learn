package com.example.springlearn.aop.demo3.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 *  *@Description          
 *  *@Author  zhuyunsheng       //作者
 *  *@Date 2021/7/14 17:19      //创建时间
 **/
public class MySecondXML {
    public void checkPri(JoinPoint joinPoint){
        System.out.println("check permission：" +joinPoint.getKind());
        System.out.println("check permission：" +joinPoint.getArgs());
        System.out.println("check permission：" +joinPoint.getSignature());
        System.out.println("check permission：" +joinPoint.getSourceLocation());
        System.out.println("check permission：" +joinPoint.getStaticPart());
        System.out.println("check permission：" +joinPoint.getTarget());
        System.out.println("check permission：" +joinPoint.getThis());
    }
    public void writeLog(Object result){
        System.out.println("日志记录~~~~~~~~~"+result);
    }
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕前增强~~~~~~~~~~~~~~");
        Object obj = proceedingJoinPoint.proceed();//相当于执行目标程序，有可能会有返回值
        System.out.println("环绕后增强~~~~~~~~~~~~~~");
        return obj;
    }
}
