public class RepaceDigitWithCharcters {
    public static String replaceDigits(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 1; i < charArray.length; i = i + 2) {
            charArray[i] = (char) (charArray[i - 1] + charArray[i] - '0');
        }
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        System.out.println(replaceDigits("a1b2c3d4e"));
    }
}
