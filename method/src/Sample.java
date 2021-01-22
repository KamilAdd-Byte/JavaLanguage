/**
 * @author kamillodzinski
 * @version 1.0
 * {@link = method.Sample#variables}
 * {@docRoot}
 */
public class Sample {

    private static String example;
    private static int variables;
    private static char aChar;
    private static boolean aBoolean;
    private static double aDouble = 3.3;

    public static void main(String[] args) {
        /**
         * @apiNote static variable example to three object Sample give it's same
         */
        String example1 = Sample.example; // jeden egzemplarz składowej statycznej example
        String example2 = Sample.example;
        String example3 = Sample.example;
        /**
         * Lista html (same static variables with three object):
         * <ol>
         *     <li>example1
         *     <li>example2
         *     <li>example3
         *     <li>
         * </ol>
         */
        System.out.println("example1 = " + example1);
        System.out.println("example2 = " + example2);
        System.out.println("example3 = " + example3);

        double aDouble = Sample.aDouble;
        double aDouble1 = Sample.aDouble;
        double aDouble2 = Sample.aDouble;
        System.out.println("aDouble = " + aDouble);
        System.out.println("aDouble1 = " + aDouble1);
        System.out.println("aDouble2 = " + aDouble2);


        /**
         *  @return default values
         */
        System.out.println(Sample.variables + "" + Sample.aChar
                + " " + Sample.aBoolean + " " + Sample.example
        + " " + Sample.aDouble);

    }
}
