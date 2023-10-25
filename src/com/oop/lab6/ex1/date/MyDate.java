package com.oop.lab6.ex1.date;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1 || year > 9999) {
            throw new IllegalArgumentException("Year must be between 1 and 9999!");
        }
        this.year = year;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", day, month, year);
    }

    public static boolean isLeapYear(int year) {
        // Check if the year is divisible by 4 and not divisible by 100, or divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // Adjust February for leap years
        if (isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        return day <= daysInMonth[month];
    }

    public static int getDayOfWeek(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            return -1;
        }

        // The year is assumed to begin in March.
        // For example, January 1995 is to be treated as month 13 of 1994.
        if (month < 3) {
            month += 12;
            year -= 1;
        }

        // get the first 2 number of year
        int century = year / 100;
        // get the last 2 number of year
        year = year % 100;
        // Using Zeller's congruent algorithms - phép đồng dư Zeller
        return (century / 4 - 2 * century + year + year / 4 + 13 * (month + 1) / 5 + day - 1) % 7;
    }
}
