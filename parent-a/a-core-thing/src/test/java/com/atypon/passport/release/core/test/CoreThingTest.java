package com.atypon.passport.release.core.test;

import com.atypon.passport.release.core.CoreThing;

import org.junit.Assert;
import org.junit.Test;

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
}
