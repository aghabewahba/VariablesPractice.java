package day08_casting_scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("pleas enter your name");

        String firstName = scan.next();

        System.out.println("nice to meet you," + firstName);
    }
}
