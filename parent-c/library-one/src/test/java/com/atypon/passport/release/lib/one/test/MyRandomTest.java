package com.atypon.passport.release.lib.one.test;

import com.atypon.passport.release.lib.one.MyRandom;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class MyRandomTest {
    MyRandom myRandom = new MyRandom();

    @Test
    public void testNoNegativeInt() {
        for (int i = 0; i < 60; i++) {
            Assert.assertTrue(myRandom.nextNonNegativeInt() > 0);
        }
    }

    @Test
    public void testDouble() {
        for (int i = 0; i < 60; i++) {
            double d = myRandom.nextDouble();
            Assert.assertTrue(d >= 0.0 && d < 1.0);
        }
    }
}
