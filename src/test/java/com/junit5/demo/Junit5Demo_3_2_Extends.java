package com.junit5.demo;

import org.junit.jupiter.api.*;

public class Junit5Demo_3_2_Extends extends Junit5Demo_3_1_Fixtures{
    @BeforeAll
    static void beforeChildAllTest(){
        System.out.println("beforeChildAll");
    }
    @AfterAll
    static void afterChildAll(){
        System.out.println("afterChildAll");
    }
    @BeforeEach
    void beforeChildEach(){
        System.out.println("beforeChildEach");
    }
    @AfterEach
    void afterChildEach(){
        System.out.println("afterChildEach");
    }
    @Test
    void fun1Child(){
        System.out.println("fun1Child");
    }
    @Test
    void fun2Child(){
        System.out.println("fun1Child");
    }
    @Test
    void fun3Child(){
        System.out.println("fun1Child");
    }

}
