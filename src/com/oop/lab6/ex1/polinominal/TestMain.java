package com.oop.lab6.ex1.polinominal;

public class TestMain {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial p2 = new MyPolynomial(2, 1, -3, 4.4);

        System.out.println("p1(x) = " + p1);
        System.out.println("p2(x) = " + p2);
        System.out.println("p1 + p2 = " + p1.add(p2));
        System.out.println("p1 * p2 = " + p1.multiply(p2));

        double x = 2.0;
        System.out.println("p1(" + x + ") = " + p1.evaluate(x));
        System.out.println("p2(" + x + ") = " + p2.evaluate(x));
    }
}
