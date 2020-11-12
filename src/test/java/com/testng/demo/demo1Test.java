package com.testng.demo;

import org.testng.annotations.*;

public class demo1Test {
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");
    }
    @BeforeMethod
    public void before(){
        System.out.println("before");
    }
    @Test
    public  void fun1(){
        System.out.println("fun1");
    }
    @Test
    public void fun2(){
        System.out.println("fun2");
    }
    @AfterMethod
    public void after(){
        System.out.println("after");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass");
    }
}
