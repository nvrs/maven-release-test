package com.atypon.passport.release.core.test;

import com.atypon.passport.release.core.CoreThing;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 *
 */
public class CoreThingTest {
    private final CoreThing coreThing = new CoreThing();

    @Test
    public void testCoreThing() {
        Assert.assertTrue(coreThing.getDouble() >= 0.0);
        Assert.assertTrue(coreThing.getDouble() < 1.0);
        Assert.assertTrue(coreThing.getSomeInt() >= 0);
    }

    @Test
    public void testThatMayFail() throws InterruptedException {
        if (Boolean.valueOf(System.getProperty("coreThingFail"))) {
            TimeUnit.MILLISECONDS.sleep(3000L);
            throw new RuntimeException("Triggering module build failure");
        }

    }
}
