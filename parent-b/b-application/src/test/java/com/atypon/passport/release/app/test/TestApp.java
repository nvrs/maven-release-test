package com.atypon.passport.release.app.test;

import com.atypon.passport.release.app.SomeApp;
import com.atypon.passport.release.core.CoreThing;

import org.junit.Test;

/**
 *
 */
public class TestApp {

    @Test
    public void testInit() {
        SomeApp app = new SomeApp(new CoreThing());
        app.isInit();
    }
}
