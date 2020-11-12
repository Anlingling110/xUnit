package com.junit5.demo;
/**
 * 增加断言
 */

import com.util.Calculator;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Junit5Demo_2_1_Assert {
    @Test
    @Order(1)
    void addTest() {
        final int result01 = Calculator.add(2,4);
        System.out.println(result01);
        final int result02 = Calculator.add(2,4);
        System.out.println(result02);
        final int result03 = Calculator.add(2,4);
        System.out.println(result03);
        assertAll("加法结果校验: ",
            ()->assertEquals(6,result01),
            ()->assertEquals(7,result02),
            ()->assertEquals(8,result03)
        );
    }
    @Test
    @Order(2)
    void subtractTest() throws InterruptedException {
        int result = Calculator.subtract(2,2);
        System.out.println(result);
        assertEquals(0,result);
    }
    @Test
    @Order(3)
    void multiplyTest(){
        int result = Calculator.multiply(2,2);
        System.out.println(result);
        assertEquals(4,result);
    }
    @Test
    @Order(4)
    void divideTest(){
        int result = Calculator.divide(2,2);
        System.out.println(result);
        assertEquals(1,result);
    }
    @Test
    void clear(){
        Calculator.clear();
    }
    @Test
    @Order(5)
    void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        System.out.println(result);
        assertEquals(4,result);
    }
}
