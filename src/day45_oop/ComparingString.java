package day45_oop;

public class ComparingString {
    public static void main(String[] args) {
        String word1 = "java"; //in string pool
        String word2 = "java";//re-use from string pool
        String word3 = new String("java");//creat in Heap , outside string pool
        String word4 = new String("java");//creat in Heap , outside string pool

        System.out.println(word1 == word2);//true point to same object in pool
        System.out.println(word1 == word3 );//false point to diffrent object in Heap and pool
        System.out.println(word3 == word4);//false ->point to different object in Heap

        System.out.println(word1.equals(word2));//true comparing value
        System.out.println(word1.equals(word3));//true comparing value
        System.out.println(word3.equals(word4));//true comparing value

    }
}
