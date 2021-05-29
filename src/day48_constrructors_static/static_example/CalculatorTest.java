package day48_constrructors_static.static_example;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator.add(5,3);//add static method can be called using classname// static way

        Calculator calcObject =new Calculator();
        calcObject.multiply(2,4);

        calcObject.add(10,45);
    }
}
