package com.junit4.suit;

import com.junit4.demo.BuyTest;
import com.junit4.demo.LoginTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginTest.class,
        BuyTest.class
})
public class Junit4SuitTest {
}
