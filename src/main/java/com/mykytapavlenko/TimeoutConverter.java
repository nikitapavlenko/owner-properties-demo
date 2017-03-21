package com.mykytapavlenko;

import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class TimeoutConverter implements Converter {


    @Override
    public Object convert(Method method, String s) {
        String[] values = s.split(":");
        int amount = Integer.parseInt(values[0]);
        TimeUnit timeUnit = TimeUnit.valueOf(values[1]);
        return new TimeOut(amount, timeUnit);
    }
}
