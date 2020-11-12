package com.junit5.demo;
/**
 * assertAll:断言失败扔继续执行程序
 */

import com.util.Calculator;
import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("Epic 计算器项目")//allure注解
public class Junit5Demo_5_1_Allure {
    @Test
    @Order(1)
    //allure注解
    @Description("Description")
    @Story("Story 加法测试")
    @DisplayName("DisplayName 加法")
    @Severity(SeverityLevel.BLOCKER)
    @Issue("https://www.baidu.com/")
    @Link(name = "Link 百度", type = "link测试", url = "https://www.baidu.com/")
    void addTest() {
        final int result01 = Calculator.add(2,4);
        System.out.println(result01);
        final int result02 = Calculator.add(2,4);
        System.out.println(result02);
        final int result03 = Calculator.add(2,4);
        System.out.println(result03);
        Allure.addAttachment("pic","image/jpg",this.getClass().getResourceAsStream("/pic0.jpg"),".jpg");
        assertAll("加法结果校验: ",
            ()->assertEquals(6,result01),
            ()->assertEquals(7,result02),
            ()->assertEquals(8,result03)
        );
    }
    @Test
    @Order(2)
    @Story("Story 减法测试")
    void subtractTest() throws InterruptedException {
        int result = Calculator.subtract(2,2);
        System.out.println(result);
        assertEquals(0,result);
    }
    @Test
    @Order(3)
    @Story("Story 乘法测试")
    void multiplyTest(){
        int result = Calculator.multiply(2,2);
        System.out.println(result);
        assertEquals(4,result);
    }
    @Test
    @Order(4)
    @Story("Story 除法测试")
    void divideTest(){
        int result = Calculator.divide(2,2);
        System.out.println(result);
        assertEquals(1,result);
    }
    @BeforeEach
    void clear(){
        Calculator.clear();
    }
    @Test
    @Order(5)
    @Story("Story 累加测试")
    void countTest() throws InterruptedException {
        int result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        System.out.println(result);
        assertEquals(4,result);
    }
}
