package com.junit5.demo;

import org.junit.jupiter.api.*;

public class Junit5Demo_3_1_Fixtures {
    @BeforeAll
    static void beforeAllTest(){
        System.out.println("beforeAll");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("afterAll");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("beforeEach");
    }
    @AfterEach
    void afterEach(){
        System.out.println("afterEach");
    }
    @Test
    void fun1(){
        System.out.println("fun1");
    }
    @Test
    void fun2(){
        System.out.println("fun1");
    }
    @Test
    void fun3(){
        System.out.println("fun1");
    }

}
