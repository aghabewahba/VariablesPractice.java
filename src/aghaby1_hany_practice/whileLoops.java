package aghaby1_hany_practice;
import java.util.*;
public class whileLoops {
    public static void main(String[] args) {
      //  int count , number;
        Scanner keyboard =new Scanner(System.in);
       // System.out.println("Enter a number");
      //  number = keyboard.nextInt();


     //   count =1;
     //   while(count<=number ){
     //       System.out.print(count+",");
          //  count++;
       //     count+=5;

     //   }
        int total =0;
        System.out.println("Enter the positive integer");
        int nextNum =keyboard.nextInt();
        while(nextNum > 0){
            total = total + nextNum;
            nextNum = keyboard.nextInt();



        }
        System.out.println( "Sum of all number:" + total);





    }
}
