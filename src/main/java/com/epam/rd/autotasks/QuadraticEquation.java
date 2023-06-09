package com.epam.rd.autotasks;

public class QuadraticEquation {
    public String solve(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("First parameter can't be zero.");
        }

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant < 0) {
            return "no roots";
        } else if (discriminant == 0) {
            double x = (-b) / (2 * a);

            return String.valueOf(x);
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            return x1 + " " + x2;
        }
    }

}