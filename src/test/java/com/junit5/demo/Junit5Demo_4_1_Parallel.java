package com.junit5.demo;

import com.util.Calculator;
import org.junit.jupiter.api.RepeatedTest;

public class Junit5Demo_4_1_Parallel{
    @RepeatedTest(10)
    void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        System.out.println(result);
    }
    @RepeatedTest(10)
    void countSynTest() throws InterruptedException {
        int result = Calculator.synCount(1);
        System.out.println(result);
    }
}
