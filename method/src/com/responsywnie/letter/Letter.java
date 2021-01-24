//: operators
package com.responsywnie.letter;
/**
 * @apiNote Aliasing with object.
 * @author kamillodzinski
 */
public class Letter {
    char c;
}

class PassObject {
    static void f(Letter y){
        y.c = 'Z';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1. x.c: " + x.c);

        f(x);
        System.out.println("2. x.c: " + x.c);
    }
}
