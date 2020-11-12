package com.util;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

public class Calculator {
    public static int result = 0;
    @Test
    public static int add(int x, int y) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result = x + y;
        return result;
    }
    @Test
    public static int count(int x) throws InterruptedException {
        int i = result;
        Thread.sleep(1000);
        result = i + x;
        return result;
    }
    @Test
    public synchronized static int synCount(int x) throws InterruptedException {
        int i = result;
        Thread.sleep(1000);
        result = i + x;
        return result;
    }
    @Test
    public static int subtract(int x, int y) throws InterruptedException {
        Thread.sleep(1000);
        int result = x - y;
        return result;
    }
    @Test
    public static int multiply(int x, int y){
        result = x * y;
        return result;
    }
    @Test
    public static int divide(int x, int y){
        result = x / y;
        return result;
    }
    public static void clear() {
        result = 0;
        System.out.println("已清0");
    }
}
