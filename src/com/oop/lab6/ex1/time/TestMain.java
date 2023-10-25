package com.oop.lab6.ex1.time;

public class TestMain {
    public static void main(String[] args) {
        MyTime time1 = new MyTime(1, 2, 3);
        System.out.println(time1);

        time1.setHour(4);
        time1.setMinute(5);
        time1.setSecond(6);
        System.out.println(time1);
        System.out.printf("Hour: %02d\n", time1.getHour());
        System.out.printf("Minute: %02d\n", time1.getMinute());
        System.out.printf("Second: %02d\n", time1.getSecond());

        time1.setTime(23, 59, 58);
        System.out.println(time1);

        System.out.println("Test nextSecond and previousSecond: ");
        System.out.println(time1);
        System.out.println(time1.nextSecond());
        System.out.println(time1.nextSecond().nextSecond());

        System.out.println(time1.previousSecond());
        System.out.println(time1.previousSecond().previousSecond());

        System.out.println("Test nextMinute and previousMinute: ");
        System.out.println(time1);
        System.out.println(time1.nextMinute());
        System.out.println(time1.nextMinute().nextMinute());

        System.out.println(time1.previousMinute());
        System.out.println(time1.previousMinute().previousMinute());

        System.out.println("Test nextHour and previousHour: ");
        System.out.println(time1);
        System.out.println(time1.nextHour());
        System.out.println(time1.nextHour().nextHour());

        System.out.println(time1.previousHour());
        System.out.println(time1.previousHour().previousHour());
    }
}
