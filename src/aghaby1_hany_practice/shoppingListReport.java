package aghaby1_hany_practice;
import java.util.*;
public class shoppingListReport {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue ="";
        double price =0;
        int count = 1;
        double totalPrice =0;
        do {
            System.out.println("Enter Item" +count +"and its price");
            item = scan.next();
            price =scan.nextDouble();
            totalPrice +=price;
            shoppingListReport ="item"+ count + ":" + "price" +price;
            System.out.println("Add one more item");
            countinue =scan.next();
            if(countinue.equals ("yes")){
                shoppingListReport += ",";
            }
            count++;

        }while(countinue.equals("yes")&& count <=10);
        System.out.println(shoppingListReport);
        System.out.println("Total price" +totalPrice);
    }
}
