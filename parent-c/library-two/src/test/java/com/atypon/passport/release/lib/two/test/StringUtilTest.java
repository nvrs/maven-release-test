package com.atypon.passport.release.lib.two.test;

import com.atypon.passport.release.lib.two.StringUtil;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 */
public class StringUtilTest {

    @Test
    public void testConcat() {
        Assert.assertEquals("AB", StringUtil.concat("A", "B"));
    }

    @Test
    public void testInverseConcat() {
        Assert.assertEquals("BA", StringUtil.inverseConcat("A", "B"));
    }

    @Test
    public void testPalindrome() {
        Assert.assertTrue(!StringUtil.isPalindrome("ABCD"));
        Assert.assertTrue(!StringUtil.isPalindrome("ACBA"));
        Assert.assertTrue(StringUtil.isPalindrome("ABCBA"));
        Assert.assertTrue(StringUtil.isPalindrome("a new order began a more roman age bred rowena"));
    }
}
