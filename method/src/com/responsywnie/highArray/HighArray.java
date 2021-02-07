package com.responsywnie.highArray;

public class HighArray implements MethodArray{
   private long[] numbers;
   private int nElem;

    public HighArray(int maxNumbers) {
        numbers = new long[maxNumbers];
        nElem = 0;
    }

    @Override
    public boolean find(int searchNumber) {
        int j;
        for (j = 0; j < nElem; j++) {
            if (numbers[nElem] == searchNumber)
                System.out.println("Znaleziono w tablicy: " + searchNumber);
                break;

        }
    }

    @Override
    public void add(int number) {
        numbers[nElem] = number;
        nElem++;
    }

    @Override
    public boolean delete(int deleteNumber) {
        return false;
    }

    @Override
    public void display() {

    }
}
