package day10_shorthand_operator;

import java.util.Scanner;

public class NextLinBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter rent and month:");
        double rent = scan.nextDouble();
        scan.nextLine();//fix the known bug . work-AROUND
        String month = scan.nextLine();
        System.out.println("rent = " +rent);
        System.out.println("month = " + month);
        
    }
}
