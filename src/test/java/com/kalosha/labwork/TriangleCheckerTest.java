package com.kalosha.labwork;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TriangleCheckerTest {

    @ParameterizedTest
    @CsvSource({
            "0, 0, 0, false",
            "1, 1, 1, true",
            "2, 2, 3, true",
            "1, 2, 3, false",
            "1000, 1, 1, false"
    })
    void testIsTriangle(int a, int b, int c, boolean expected) {
        assertEquals(expected, TriangleChecker.isTriangle(a, b, c));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0, 0, Not a triangle",
            "1, 1, 1, Equilateral",
            "2, 2, 3, Isosceles",
            "3, 4, 5, Scalene",
            "1, 2, 3, Not a triangle"
    })
    void testTriangleType(int a, int b, int c, String expected) {
        assertEquals(expected, TriangleChecker.triangleType(a, b, c));
    }

    @Test
    void testBoundaryValues() {
        assertEquals("Isosceles", TriangleChecker.triangleType(6, 6, 10));
        assertEquals("Not a triangle", TriangleChecker.triangleType(0, 5, 5));
    }
}