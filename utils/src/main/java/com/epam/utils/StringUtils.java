package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * @author Aliaksei Halkin
 */
public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return NumberUtils.toDouble(str) > 0;
    }
}
