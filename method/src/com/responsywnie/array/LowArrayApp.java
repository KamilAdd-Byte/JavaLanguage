package com.responsywnie.array;

public class LowArrayApp {
    public static void main(String[] args) {
        LowArray lowArray;                  //referencja do klasy
        lowArray = getLowArray();

        int nElems;
        nElems = 10;

        getAllNumbers(lowArray, nElems);

        findXNumber(lowArray, nElems);

        nElems = deletedXNumber(lowArray, nElems);

        getAllNumbersAfterOperation(lowArray, nElems);

    }

    private static LowArray getLowArray() {
        LowArray lowArray;
        lowArray = new LowArray(100);  //tworzymy obiekt klasy LowArray
        int nElems = 0;                    //liczba elementów tablicy
        int j;                             //licznik pętli

        lowArray.setElem(0, 77);
        lowArray.setElem(1, 23);
        lowArray.setElem(2, 3);
        lowArray.setElem(3, 87);
        lowArray.setElem(4, 47);
        lowArray.setElem(5, 71);
        lowArray.setElem(6, 52);
        lowArray.setElem(7, 66);
        lowArray.setElem(8, 88);
        lowArray.setElem(9, 9);
        return lowArray;
    }

    private static void getAllNumbersAfterOperation(LowArray lowArray, int nElems) {
        int j;
        for (j = 0; j < nElems; j++)
            System.out.print(lowArray.getElem(j) + " ");
        System.out.println();
    }

    private static int deletedXNumber(LowArray lowArray, int nElems) {
        int j;
        long xNumber = 52;
        for (j = 0; j < nElems; j++)
            if (lowArray.getElem(j) == xNumber)
                break;
        for (int k = j; k < nElems; k++)
            lowArray.setElem(k, (int) lowArray.getElem(k + 1));
        nElems--;
        return nElems;
    }

    private static void findXNumber(LowArray lowArray, int nElems) {
        int j;
        int searchNumber = 52;
        for (j = 0; j < nElems; j++)
            if (lowArray.getElem(j) == searchNumber)
                break;
        if (j == searchNumber)
            System.out.print("W tym indexie nie ma liczby: " + searchNumber);
        else
            System.out.print("Znaleziona liczba " + searchNumber);
        System.out.println();
    }

    private static void getAllNumbers(LowArray lowArray, int nElems) {
        System.out.print("Liczby dostepne w obiekcie array: ");
        getAllNumbersAfterOperation(lowArray, nElems);
    }
}
