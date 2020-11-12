package com.junit5.demo;
/**
 * 混合并发：使用方法变量，不使用类变量
 */

import com.util.Calculator;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Junit5Demo_4_2_MixParallel {
    @RepeatedTest(10)
    void addTest() throws InterruptedException {
        int result = Calculator.add(2,3);
        System.out.println(result);
        assertEquals(5,result);

    }
    @RepeatedTest(10)
    void subtractTest() throws InterruptedException {
        int result = Calculator.subtract(4,1);
        System.out.println(result);
        assertEquals(3,result);
    }
}
