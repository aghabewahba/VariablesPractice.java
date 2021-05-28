package day13_conditional_statement;

import java.sql.SQLOutput;

public class IFWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        if(isHungry){
            System.out.println("I am hungry, i will go get somthing to eat");
            System.out.println("Then code java");
        }else{
            System.out.println("I am not hungry, I will keep coding java");
        }
        double price = 130.44;
        boolean isAffodable = price <= 200.0;
        System.out.println("isAffodable = " + isAffodable);
        if (isAffodable){
            System.out.println("I can afford it , lets buy");
        }else {
            System.out.println("Too expensive, lets keep coding java");
        }
        boolean isRemotejob = true;
        if(! isRemotejob){
            System.out.println("sorry I am not interested");
        } else {
            System.out.println("SUR, I AM INTERESTED, WHAT IS INTERVIEW PROCESS?");
        }
    }
}
