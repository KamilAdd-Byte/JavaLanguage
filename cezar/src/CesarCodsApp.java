public class CesarCodsApp {
    public static void main(String[] args) {
        String text = "KAMILJESTTUTAJ";
        System.out.println(text);
        String encode = CesarCode.encode(text);
        System.out.println(encode);
        String decode = CesarCode.decode(encode);
        System.out.println(decode);
    }
}
