package day60_exceptions;

import java.util.*;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            System.out.println("you entered " + num);
           // System.out.println(num/0);
           // System.exit(0);//stop java all together,finally block will not running
        } catch (InputMismatchException e) {
            System.out.println("you enter invalid value!");
        } finally {

            scan.close();//close and clean up the scanner
            System.out.println("finally block runs always");

        }
    }
}