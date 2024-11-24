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
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;
        while (a < 0 || b < 0 || c < 0) {
            try {
                if(a < 0) {
                    a = scanner.nextInt();
                }
                if (a < 0) {
                    System.out.println("Please enter three non-negative integers:");
                    continue;
                }
                if(b < 0) {
                    b = scanner.nextInt();
                }
                if (b < 0) {
                    System.out.println("Please enter three non-negative integers:");
                    continue;
                }
                if(c < 0) {
                    c = scanner.nextInt();
                }
                if (c < 0) {
                    System.out.println("Please enter three non-negative integers:");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Please enter three non-negative integers:");
                scanner.nextLine();
            }
        }

        if (isTriangle(a, b, c)) {
            System.out.println("Triangle type: " + triangleType(a, b, c));
        } else {
            System.out.println("Not a triangle");
        }
    }
}
