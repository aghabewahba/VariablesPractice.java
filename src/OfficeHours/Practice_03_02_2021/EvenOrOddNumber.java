package OfficeHours.Practice_03_02_2021;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        System.out.println("Enter even number 0-100");
        for(int i =1; i<=100;i++){
            if(i %2 ==0){
                System.out.print(i + " ");
            }
        }
        System.out.println("\n Odd number 0-100");
        for(int n =1; n<=100;n++){
            if(n % 2 !=0){
                System.out.print(n +",");
            }
        }
    }
}
