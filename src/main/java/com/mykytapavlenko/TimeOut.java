package com.mykytapavlenko;

import java.util.concurrent.TimeUnit;

public class TimeOut {
    private int amount;
    private TimeUnit timeUnit;

    public TimeOut(int amount, TimeUnit timeUnit
    ) {
        this.amount = amount;
        this.timeUnit = timeUnit;
    }

    public int getAmount() {
        return amount;
    }

    public TimeUnit getTimeUnit() {
        return timeUnit;
    }
}
