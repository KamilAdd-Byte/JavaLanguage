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
        for (j = 0; j < nElem; j++)
            if (numbers[j] == searchNumber)
                break;
        if (j==nElem){
            System.out.println("nie znaleziono " + searchNumber);
            return false;
        } else{
            System.out.println("znaleziono " + searchNumber);
            return true;
        }

    }

    @Override
    public void add(int number) {
        numbers[nElem] = number;
        nElem++;
    }

    @Override
    public boolean delete(int deleteNumber) {
        int j;
        for (j= 0; j < nElem; j++)
            if (deleteNumber == numbers[j])
                break;
        if (j==nElem)
            return false;
        else {
            for (int k = j; k < nElem; k++)
                numbers[k] = numbers[k+1];
            nElem--;
            return true;
        }
    }

    @Override
    public void display() {
        for (int j = 0; j < nElem; j++) {
            System.out.print(numbers[j]+" ");
        System.out.print("");
        }
    }

    public long[] getNumbers() {
        return numbers;
    }

    public void setNumbers(long[] numbers) {
        this.numbers = numbers;
    }

    public int getnElem() {
        return nElem;
    }

    public void setnElem(int nElem) {
        this.nElem = nElem;
    }
}
