package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10,5);
        addNumbers(100,200,300);
        addNumbers(23,32,45,67,100,22,78,98,556,664,777,11,99,4444,123,567,999);
        addNumbers();

    }
    public static void addNumbers(int... nums){
        //inside the method, it is used as regular array.
        int sum =0;
        for(int n : nums){
            sum += n;
        }
        System.out.println("sum =" + sum);
    }
}
