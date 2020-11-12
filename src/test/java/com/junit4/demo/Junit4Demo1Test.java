package com.junit4.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Junit4Demo1Test {
    @Before
    public void before(){
        System.out.println("before");
    }
    @Test
    public void fun1(){
        System.out.println("fun1()");
    }
    @Test
    public void fun2(){
        System.out.println("fun2()");
    }
    @Test
    @Ignore
    public void fun3(){
        System.out.println("fun3()");
    }
    @After
    public void after(){
        System.out.println("after");
    }
}
