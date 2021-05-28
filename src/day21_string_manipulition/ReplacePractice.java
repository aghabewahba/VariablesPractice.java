package day21_string_manipulition;

public class ReplacePractice {
    public static void main(String[] args) {
        String word ="github";
        System.out.println(word . replace("hub","lap"));
        
        
        String sentence = "java is fun";
        String withNoSpace =sentence .replace(" ","") ;
        System.out.println("withNoSpace = " + withNoSpace);

        sentence = sentence. replace("java" ,"selinum"). replace ("fun", "a lot of fun");
        System.out.println("sentence= " + sentence);

   String result ="1-48 of over 4,000 result for java book";
         result= result.replace("1-48 of over" ,""). replace  ("4,000","4000"). replace("result for java book", "");
        System.out.println("result = " + result);
    }
}
