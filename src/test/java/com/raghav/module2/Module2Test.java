package com.raghav.module2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Module2Test {


    @Test
    public void test3() {
        Assert.assertTrue(true);
    }

    @Test
    public void test4() {
        Assert.fail();
    }
}
