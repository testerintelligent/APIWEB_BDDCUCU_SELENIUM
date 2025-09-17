package com.common;

import org.apache.commons.lang.RandomStringUtils;

public class BaseClass1 {
    public static String userID;

    public static String randomString(int n) {
        String rand = RandomStringUtils.randomAlphabetic(n);
        return rand;
    }

}
