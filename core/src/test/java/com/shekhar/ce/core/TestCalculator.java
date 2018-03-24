package com.shekhar.ce.core;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

    @Test
    public void testAdd() {
        Assert.assertEquals(2, new Calculator().add(1,1));
    }
}
