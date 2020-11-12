package com.junit5.demo;
/**
 * 测试类
 */

import com.util.Calculator;
import org.junit.jupiter.api.Test;

public class Junit5Demo_1_1_Base {
    @Test
    void addTest() throws InterruptedException {
        int result = Calculator.add(2,2);//静态方法可以直接调用，结果存入变量
        System.out.println(result);
    }
    @Test
    void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        System.out.println(result);
    }
    @Test
    void subtractTest() throws InterruptedException {
        int result = Calculator.subtract(2,2);
        System.out.println(result);
    }
    @Test
    void multiplyTest(){
        int result = Calculator.multiply(2,2);
        System.out.println(result);
    }
    @Test
    void divideTest(){
        int result = Calculator.divide(2,2);
        System.out.println(result);
    }
}
