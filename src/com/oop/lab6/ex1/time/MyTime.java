package com.oop.lab6.ex1.time;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > 23 || hour < 0) {
            throw new IllegalArgumentException("Hour must be between 0 and 23!");
        } else {
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute > 59 || minute < 0) {
            throw new IllegalArgumentException("Minute must be between 0 and 59!");
        } else {
            this.minute = minute;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second > 59 || second < 0) {
            throw new IllegalArgumentException("Second must be between 0 and 59!");
        } else {
            this.second = second;
        }
    }

    public void setTime(int hour, int minute, int second) {
        if ((hour > 23 || hour < 0) || (minute > 59 || minute < 0) || (second > 59 || second < 0)) {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        } else {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond() {
        if (second < 59) {
            second++;
        } else {
            second = 0;
            if (minute < 59) {
                minute++;
            } else {
                minute = 0;
                if (hour < 23) {
                    hour++;
                } else {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public MyTime nextMinute() {
        if (minute < 59) {
            minute++;
        } else {
            minute = 0;
            if (hour < 23) {
                hour++;
            } else {
                hour = 0;
            }
        }
        return this;
    }

    public MyTime nextHour() {
        if (hour < 23) {
            hour++;
        } else {
            hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        if (second > 0) {
            second--;
        } else {
            second = 59;
            if (minute > 0) {
                minute--;
            } else {
                minute = 59;
                if (hour > 0) {
                    hour--;
                } else {
                    hour = 23;
                }
            }
        }
        return this;
    }

    public MyTime previousMinute() {
        if (minute > 0) {
            minute--;
        } else {
            minute = 59;
            if (hour > 0) {
                hour--;
            } else {
                hour = 23;
            }
        }
        return this;
    }

    public MyTime previousHour() {
        if (hour > 0) {
            hour--;
        } else {
            hour = 23;
        }
        return this;
    }

}
