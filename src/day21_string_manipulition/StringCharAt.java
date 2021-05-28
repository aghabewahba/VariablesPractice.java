package day21_string_manipulition;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word . charAt(0));
        System.out.println(word .charAt(1));
        System.out.println(word .charAt(2));
        System.out.println(word .charAt(3));


        String company = "Cybertek";
        System.out.println("first letter :" + company .charAt(0));
        char first =company .charAt(0);
        char second =company .charAt(1);
        char Third =company .charAt(2);
        char fourth = company .charAt(4);
        char fifth = company . charAt(5);
        char sixth = company . charAt(6);
        char seventh= company . charAt(7);
        char eighth = company . charAt(8);

        System.out.println(first);
        System.out.println(first + " " +second +" " +Third +" " +fourth +" " +fifth +" " + sixth +" "
                           +seventh +" "+eighth +" ") ;
        String withSpaces = first +" "+second+" "+Third+" "+fourth+" "+fifth+" "+sixth
                +" "+seventh +" "+eighth;
        System.out.println("withSpaces = " + withSpaces);


    }
}
