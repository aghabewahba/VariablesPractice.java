package day35_method_with_param;

public class MutipleParams {
    public static void main(String[] args) {
        showSum(10.45 ,55.10);
    }
    public static void showSum(double num1 ,double num2){
        double sum = num1 +num2;
        System.out.println("The sum =" + sum);
    }
}
