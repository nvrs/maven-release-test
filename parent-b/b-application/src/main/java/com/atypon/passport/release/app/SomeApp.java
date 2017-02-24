package com.atypon.passport.release.app;

import com.atypon.passport.release.core.CoreThing;

/**
 *
 */
public class SomeApp {

    private final CoreThing coreThing;

    public SomeApp(CoreThing coreThing) {
        this.coreThing = coreThing;
    }

    public CoreThing getCoreThing() {
        return coreThing;
    }

    public boolean isInit() {
        // dummy check, dummy comment
        return coreThing != null;
    }
}
