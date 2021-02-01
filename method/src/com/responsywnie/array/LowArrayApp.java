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

        showNumberofLowArray(lowArray, nElems);
        findNumberInArray(lowArray, nElems);

    }

    private static void findNumberInArray(LowArray lowArray, int nElems) {
        int j;
        int searchNumber = 1;
        for (j= 0; j < nElems; j++)
            if (lowArray.getElem(j) == searchNumber)
                break;
        if (j == searchNumber)
            System.out.print("Znaleziona liczba " + searchNumber);
        else
            System.out.print("W tym indexie nie ma liczby: " + searchNumber);
    }


    private static void showNumberofLowArray(LowArray lowArray, int nElems) {
        int j;
        for (j = 0; j < nElems; j++){
            System.out.print(lowArray.getElem(j)+" ");
        }
    }
}
