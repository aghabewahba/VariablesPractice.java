package day18_counditions_practice_string_intro;

public class FizzBuzz {
    public static void main(String[] args) {
        int number = 15;
        if(number % 3 == 0 && number % 5 == 0){
            System.out.println("FizzBuzz");
        }else if (number % 3 == 0){
            System.out.println("Fizz");
        }else if (number % 5 == 0){
            System.out.println("Buzz");
        }
        System.out.println(number);
    }
}
