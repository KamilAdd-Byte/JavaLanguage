package com.responsywnie.array;

public class LowArrayApp {
    public static void main(String[] args) {
        LowArray lowArray;                  //referencja do klasy
        lowArray = new LowArray(100);  //tworzymy obiekt klasy LowArray
        int nElems = 0;                    //liczba elementów tablicy
        int j;                             //licznik pętli

        lowArray.setElem(0,77);
        lowArray.setElem(1,23);
        lowArray.setElem(2,3);
        lowArray.setElem(3,87);
        lowArray.setElem(4,47);
        lowArray.setElem(5,71);
        lowArray.setElem(6,52);
        lowArray.setElem(7,66);
        lowArray.setElem(8,88);
        lowArray.setElem(9,9);

        nElems = 10;

        System.out.print("Liczby dostepne w obiekcie array: ");
        for (j = 0; j < nElems; j++)
            System.out.print(lowArray.getElem(j)+" ");
        System.out.println("");

        int searchNumber = 8;
        for (j= 0; j < nElems; j++)
            if (lowArray.getElem(j) == searchNumber)
                break;
        if (j == searchNumber)
            System.out.print("W tym indexie nie ma liczby: " + searchNumber);
        else
            System.out.print("Znaleziona liczba " + searchNumber);
        System.out.println("");

        long xNumber = 77;
        for (j = 0; j < nElems; j++)
            if (lowArray.getElem(j) == xNumber)
                break;
        for (int k=j; k < nElems; k++)
            lowArray.setElem(k, (int) lowArray.getElem(k+1));
        nElems--;

        for (j = 0; j < nElems; j++)
            System.out.print(lowArray.getElem(j)+ " ");
        System.out.println("");
    }
}
