package com.responsywnie.array;

public class LowArray {
    private final long[] numbers;

    public LowArray(int size) {    //konstruktor
        numbers = new long[size];
    }

    public void setElem(int index, int value) {
        numbers[index] = value;
    }

    public long getElem(int index) {
        return numbers[index];
    }
}
