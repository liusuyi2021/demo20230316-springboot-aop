package com.example.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @ClassName: testAspect
 * @Description:
 * @Author: Administrator
 * @Date: 2023年03月16日 8:37
 * @Version: 1.0
 **/
@Aspect
@Component
public class testAspect {

    @Pointcut("@annotation(com.example.annotation.testAnnotation)")
    public void testPintcut()
    {}
    @Before("testPintcut()")
    void before()
    {
        System.out.println("before。。。");
    }
    @After("testPintcut()")
    void after()
    {
        System.out.println("after。。。");
    }
    @AfterReturning("testPintcut()")
    void AfterReturning()
    {
        System.out.println("AfterReturning。。。");
    }
    @AfterThrowing("testPintcut()")
    void AfterThrowing()
    {
        System.out.println("AfterThrowing。。。");
    }
}
