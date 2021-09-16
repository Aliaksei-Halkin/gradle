package com.epam.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Aliaksei Halkin
 */
class StringUtilsTest {
    @Test
    void testIsPositiveNumberSuccess() {
        boolean positiveNumber = StringUtils.isPositiveNumber("5");
        assertTrue(positiveNumber);
    }

    @Test
    void testIsNegativeNumberFailure() {
        boolean positiveNumber = StringUtils.isPositiveNumber("-5");
        assertFalse(positiveNumber);
    }

    @Test
    void testIsZeroNumberFailure() {
        boolean positiveNumber = StringUtils.isPositiveNumber("0");
        assertFalse(positiveNumber);
    }

    @Test
    void testIsInvalidDataFailure() {
        boolean positiveNumber = StringUtils.isPositiveNumber("hello");
        assertFalse(positiveNumber);
    }
}