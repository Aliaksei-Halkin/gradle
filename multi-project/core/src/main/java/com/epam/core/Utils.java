package com.epam.core;

import com.epam.utils.StringUtils;

import java.util.Arrays;

/**
 * @author Aliaksei Halkin
 */
public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        return Arrays.stream(str).allMatch(value ->StringUtils.isPositiveNumber(value));
    }
}