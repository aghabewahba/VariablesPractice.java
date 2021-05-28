package day24_loops;
import java.util.*;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int secretPincCode =1234;
        int pinCode;
        do{
            System.out.println("Enter your pin code");
           pinCode = scan.nextInt();
        }while(pinCode != secretPincCode);
            System.out.println("welcome to your account");

        }
    }

