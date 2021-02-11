package com.responsywnie.letter;

public class Sign {
    float c;
}

class PassSignObject {
    static void f(Sign y) {
        y.c = 1.334F;
    }

    public static void main(String[] args) {
        Sign x = new Sign();
        x.c = 3.333F;
        System.out.println(x.c);

        f(x);
        System.out.println(x.c);
    }
}
