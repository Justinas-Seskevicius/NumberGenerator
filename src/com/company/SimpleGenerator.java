package com.company;

public class SimpleGenerator implements NumberGenerator {

    private final int DIVISOR = Integer.MAX_VALUE;
    private final int COEFFICIENT;

    public SimpleGenerator(int coefficient){
        COEFFICIENT = coefficient;
    }

    @Override
    public long generateNumber(long num){
        return num * COEFFICIENT % DIVISOR;
    }
}
