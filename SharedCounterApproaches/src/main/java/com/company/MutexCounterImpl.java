package com.company;

public class MutexCounterImpl implements Counter {
    private int value;
    @Override
    public synchronized void increment() {
        value++;
    }

    @Override
    public long getValue() {
        return value;
    }
}