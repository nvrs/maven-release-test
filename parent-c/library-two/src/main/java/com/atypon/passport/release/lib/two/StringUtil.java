package com.atypon.passport.release.lib.two;

/**
 *
 */
public class StringUtil {

    public static String concat(CharSequence a, CharSequence b) {
        return a.toString() + b.toString();
    }

    public static String inverseConcat(CharSequence a, CharSequence b) {
        return b.toString() + a.toString();
    }

    public static boolean isPalindrome(String b) {
        // normalize first
        String a = b.toLowerCase().replaceAll(" ", "");
        if (a.length() < 2) {
            return true;
        }

        char[] chars = a.toCharArray();
        for (int i = 0, j = chars.length - 1; i < chars.length; i++,j--) {
            if (chars[i] != chars[j]) {
                return false;
            }
        }

        return true;
    }
}
