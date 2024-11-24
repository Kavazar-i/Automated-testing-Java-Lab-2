package com.kalosha.labwork;

import java.util.Scanner;

public class TriangleChecker {

    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static String triangleType(int a, int b, int c) {
        if (!isTriangle(a, b, c)) {
            return "Not a triangle";
        }
        if (a == b && b == c) {
            return "Equilateral";
        }
        if (a == b || a == c || b == c) {
            return "Isosceles";
        }
        return "Scalene";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three non-negative integers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (isTriangle(a, b, c)) {
            System.out.println("Triangle type: " + triangleType(a, b, c));
        } else {
            System.out.println("Not a triangle");
        }
    }
}
