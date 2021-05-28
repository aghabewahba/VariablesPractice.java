package day24_loops;
import java.util.*;
public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int secretNumber =0;
        int guessingNumber;
        do{
            System.out.println("Guess the secret number");
            guessingNumber =scan.nextInt();
            if(guessingNumber < secretNumber){
                System.out.println("wrong , your number is to large");
            }else if(guessingNumber < secretNumber ){
                System.out.println("wrong , your number is to small");
            }

        }while( secretNumber != guessingNumber  );
        System.out.println("Congratulations you won !secret number :" + secretNumber);

    }
}
