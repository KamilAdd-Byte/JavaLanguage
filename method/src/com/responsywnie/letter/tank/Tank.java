package com.responsywnie.letter.tank;

/**
 * @author kamillodzinski
 */
public class Tank {

    int level;
    float defense;

    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;
        t1.defense = 3.4443333332F;
        t2.defense = 2.555433F;
        System.out.println(t1.level);
        System.out.println(t2.level);
        System.out.println(t1.defense);
        System.out.println(t2.defense);

        t1 = t2;
        System.out.println(t1.level);
        System.out.println(t2.level);
        System.out.println(t1.defense);
        System.out.println(t2.defense);

        t1.level = 27;
        t1.defense = 443.3332332F;
        System.out.println(t1.level);
        System.out.println(t2.level);
        System.out.println(t1.defense);
        System.out.println(t2.defense);
    }
}
