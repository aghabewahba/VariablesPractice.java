package day32_arrays_Split;
import java.util.Arrays;

public class SplitMethode {
    public static void main(String[] args) {
        String words = "java:python:selenium:html";
        String[] wordsArray = words.split(",");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array =" + wordsArray.length);
        for (String each : wordsArray) {
            System.out.println(each);
        }


        String sentence = "today I am coding java arrays";
        String[] wordInSentence = sentence.split(" ");
        System.out.println("First word : " + wordInSentence[0]);
        System.out.println("First word : " + sentence.split(" ")[0]);
        System.out.println("Number of words in sentence = " + wordInSentence.length);
        for (String each : wordInSentence) {
            System.out.println(each);


        }
    }
}