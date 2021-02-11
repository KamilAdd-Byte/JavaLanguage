public class CesarCode {
    public static String encode(String text){
        StringBuilder newString = new StringBuilder();
        for (char c: text.toCharArray()){
            char encodeChar = (char)(65+ (c-62) % 26);
            newString.append(encodeChar);
        }
        return newString.toString();
    }
    public static String decode(String text){
        StringBuilder newString = new StringBuilder();
        for (char c: text.toCharArray()){
            char decodeChar = (char)(65 + (c-42) % 26);
            newString.append(decodeChar);
        }
        return newString.toString();
    }
}
