package com.study.test;

import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void sumTest(){
        int a = 1;
        int b = 2;
        int expected = 3;
        int result = App.sum(a, b);
    }
}
