package com.atypon.passport.release.lib.one;

import java.util.Random;

/**
 *
 */
public class MyRandom extends Random {

    @Override
    public double nextDouble() {
        return super.nextDouble();
    }

    public int nextNonNegativeInt() {
        return Math.abs(super.nextInt());
    }
}
