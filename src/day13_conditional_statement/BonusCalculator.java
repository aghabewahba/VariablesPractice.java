package day13_conditional_statement;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus;
        double salesAmount = 5000.0;

        if (salesAmount <= 2000) {
            System.out.println("Good job; you are qualify for bonus ");
            bonus = 50.0;
        } else {
            System.out.println("Great job you are qualify full bonus");
            bonus = 100.0;
        }
        System.out.println("your total bonus : $ " + bonus);
    }
}