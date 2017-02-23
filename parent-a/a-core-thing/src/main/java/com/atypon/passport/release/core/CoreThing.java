package com.atypon.passport.release.core;

import com.atypon.passport.release.lib.one.MyRandom;
import com.atypon.passport.release.lib.two.StringUtil;

/**
 *
 */
public class CoreThing {
    private final MyRandom random = new MyRandom();

    public CoreThing() {
        StringUtil.concat("ab", "cd");
        StringUtil.inverseConcat("ab", "cd");
    }

    public double getDouble() {
        return random.nextDouble();
    }

    public int getSomeInt() {
        return random.nextNonNegativeInt();
    }
}
