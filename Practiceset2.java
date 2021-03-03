public class Practiceset2 {
    public static void main(String[] args) {
        String name = "ABHISHEK SINGH RAWAT";
        name = name.toLowerCase();
        System.out.println(name);
        name = name.replace(' ', '_');
        System.out.println(name);
        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>", "Abhishek");
        System.out.println(letter);
        String occur = "this  string contain double and triple   spaces";
        System.out.println(occur.indexOf("  "));
        System.out.println(occur.indexOf("   "));

        String leter = "dear harry\n\t this java course is nice.\n\t thanks";
        System.out.println(leter);
    }
}
