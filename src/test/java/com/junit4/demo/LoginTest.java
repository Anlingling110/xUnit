package com.junit4.demo;

import org.junit.Test;

public class LoginTest extends BaseTest{
    @Test
    public void login(){
        dataMap.put("login","登录成功");
        System.out.println(dataMap.get("login"));
    }


}
