package day12_conditional_statements;

public class IfElseStetment {
    public static void main(String[] args) {
        if (10 > 5) {
            System.out.println("CONDITION IS TRUE");
        } else {
            System.out.println("CONDITION IS FALSE");
        }


        byte age = 14;
        if (age >= 18){
            System.out.println("Eligible to vote");
            System.out.println("Age is greater or equal to 18");
        }else{
            System.out.println("Not Eligible to vote");
            System.out.println("Age is less than 18");
        }
        }
    }
