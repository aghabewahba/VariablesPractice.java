package aghaby1_hany_practice;
import java.util.Scanner;
public class OxgenLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
            System.out.println(" *** Welcome  to the Ocean ***");
            int oxegynLevel = scan.nextInt();
            int oxygenLevel =90;
            if(oxygenLevel >=90){
                System.out.println("your tank is full");
        }
           if(oxygenLevel >= 80){
               System.out.println("still ok");
           }
           if(oxygenLevel >= 70){
               System.out.println("Dont go to far");
           }
           if(oxygenLevel >= 60){
               System.out.println("Start to head back");
           }
           if(oxygenLevel >= 50){
               System.out.println("Be careful now you are at 50");
           }
        System.out.println("Enjoy your diving");
    }
}
