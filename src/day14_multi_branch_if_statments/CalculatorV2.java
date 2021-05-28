package day14_multi_branch_if_statments;
import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 number");
        double num1 =scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.println("enter operator: - ,+ ,*, /");
        char operator = scan.next().charAt(0);
        if(operator == '+'){
            System.out.println(num1 + num2);
        } else if(operator == '-'){
            System.out.println(num1 - num2);
        }else if (operator == '*'){
            System.out.println(num1 * num2);
        }else if(operator == '/'){
            System.out.println(num1 / num2);
        }
        System.out.println("invalid operator-" + operator);
    }

    }
