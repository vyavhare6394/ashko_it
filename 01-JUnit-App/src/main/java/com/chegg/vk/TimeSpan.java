package com.chegg.vk;

public class TimeSpan {
    private final char timeUnit;
    private final int numUnits;

    public TimeSpan(char time, int num) {
        timeUnit = time;
        numUnits = num;
    }

    public char getTimeUnit() {
        return timeUnit;
    }

    public int getnumUnits() {
        return numUnits;
    }
}