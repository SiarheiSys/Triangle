package org.example;

public class SquareFunction {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public SquareFunction (double a, double b, double c) {
        if (a >= 0) {
            this.a = a;
        }
        if (b >= 0) {
            this.b = b;
        }
        if (c >= 0) {
            this.c = c;
        }
    }

    public double halfOfPerimetr() {
        double per = (getA() + getB() + getC()) / 2;
        return per;
    }

    public double SquareOfTriangle() {
        double sqr = Math.sqrt(halfOfPerimetr() * (halfOfPerimetr() - getA()) * (halfOfPerimetr() - getB()) * (halfOfPerimetr() - getC()));
        return sqr;
    }
}
