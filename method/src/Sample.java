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
    private static double aDouble;


    public static void main(String[] args) {
        /**
         *  @return default values
         */
        System.out.println(Sample.variables + "" + Sample.aChar
                + " " + Sample.aBoolean + " " + Sample.example
        + " " + Sample.aDouble);

    }
}
