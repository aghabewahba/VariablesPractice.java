package aghaby1_hany_practice;
import java.util.*;

public class partyAlphabitic {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        char start =scan.next().charAt(0);
        char end =scan.next().charAt(0);
        for(char i =start;i <= end; i++) {
            System.out.print(i);
        }
    }
}
