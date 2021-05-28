package day26_loops;

public class printChars {
    public static void main(String[] args) {
        String word = "java";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }

        word = " python";
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.println(word.charAt(i));


        }
    }
}