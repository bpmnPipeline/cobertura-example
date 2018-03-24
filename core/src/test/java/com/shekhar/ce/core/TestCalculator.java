package com.shekhar.ce.core;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

    @Test
    public void testAdd() {
        Assert.assertEquals(2, new Calculator().add(1,1));
    }

   /* @Test
    public void testSub() {
        Assert.assertEquals(0, new Calculator().sub(1,1));
    }

    @Test
    public void testMult() {
        Assert.assertEquals(4, new Calculator().mul(2,2));
    }

    @Test
    public void testDiv() {
        Assert.assertEquals(2, new Calculator().div(2,1));
    }*/
}
