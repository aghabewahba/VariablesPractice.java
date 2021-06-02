package day49_static;

public class StaticMethods {

    int num = 10;
    static int count = 5;

    public static void displayMessage(String message){
        System.out.println("message: " + message);

        //System.out.println("num =" + num);//Error : num is instance . static can not acce
        System.out.println("count =" + count);//no error count is static vairable
    }
    public static void anotherStaticMethod(){
        System.out.println("another Static Method");
        displayMessage("wooden spoon");
    }
    public void instanceMethod(){
        System.out.println("instanceMethod");
        System.out.println("num =" + num);
        System.out.println("count =" + count);
        System.out.println("hello from instance method");
    }
}
