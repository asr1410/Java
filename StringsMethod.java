public class StringsMethod {
    public static void main(String[] args) {
        // String name = "Harry";
        // int length = name.length();
        // System.out.println(length);
        // System.out.println(name.toLowerCase());
        // System.out.println(name.toUpperCase());
        // System.out.println(name.toCharArray());
        String para = "        hello how are you";
        // System.out.println(para.trim());
        System.out.println(para.substring(8));
        System.out.println(para.substring(0, para.length()));
        System.out.println(para.replace('r', 'p'));
        System.out.println(para.replace("h", "hello"));
        System.out.println(para.startsWith("    "));

    }
}
