package aghaby1_hany_practice;
import java.util.Scanner;
public class AghabePractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" welcome to TD bank,\n Enter your password");
        int passWord = scan.nextInt();
        if (passWord == 8640) {
            System.out.println("Menu : 1- Withdraw 2- Deposit" + " 3-Check Balance" +
                    " +4- Other");
        } else {
            System.out.println("wrong password\n" +"Try again");

        }
    }
}
