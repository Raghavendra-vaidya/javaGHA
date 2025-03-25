package com.raghav.module1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Module1Test {

    @Test
    public void testEnv() {
        System.out.println("Running testEnv test");
        Assert.assertTrue(true);
    }

    @Test
    public void test1() {
        Assert.assertTrue(true);
    }

    @Test
    public void test2() {
        Assert.assertTrue(true);
    }
}
