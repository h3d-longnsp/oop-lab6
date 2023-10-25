package com.oop.lab6.ex1.bigint;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger int1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        System.out.println(int1);

        BigInteger int2 = new BigInteger("22222222222222222222222222222222222222222222222222");
        System.out.println(int2);

        System.out.println("Sum: " + int1.add(int2));
        System.out.println("Product: " + int1.multiply(int2));
    }
}
