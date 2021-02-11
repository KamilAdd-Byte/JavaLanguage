package com.responsywnie.random;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

public class MathOps {
    public static void main(String[] args) {

        Random random = new Random(47);
        LocalTime toLocalTime = getToLocalTime();

        int i, j, k;
        j = random.nextInt(100) + 1;
        System.out.println("od 1 do 100: " + j + " wygenerowano: " + toLocalTime);

        k = random.nextInt(200) + 1;
        System.out.println("Zakres od 0 do 200: " + k + " wygenerowano: " + toLocalTime);

        i = j + k;
        System.out.println("J + K = " + i);

    }

    private static LocalTime getToLocalTime() {
        LocalDateTime localDate = LocalDateTime.now();
        LocalTime toLocalTime = localDate.toLocalTime();
        return toLocalTime;
    }
}
