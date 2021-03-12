package com.utils;

import java.math.BigInteger;
import java.security.SecureRandom;

public final class PressmarkGenerator {

    private static SecureRandom random = new SecureRandom();

    public static String generatePressmark() {
        return new BigInteger(130, random).toString(12);
    }
}
