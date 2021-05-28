package day35_method_with_param;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(5);
        displayValue(10);
        int count= 55;
        greetByName("Mariam");
        greetByName("Nancy");
        String name ="Monica";
        greetByName(name);

    }
    public static void displayValue(int num){
        System.out.println(" value is :" + num);

    }
    /**
     * method name : greetByName
     * @param /input : String name
     * it print "hello {name}, how are you
     */
    public static void greetByName(String name){

        System.out.println("hello "+name+" , how are you , Happy Easter");
    }
}
