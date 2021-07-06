package day59_polymorphisim_execption;

import day57_abstraction_polymorhism.abstract_class_vs_interface.shapes.Circle;
import day57_abstraction_polymorhism.abstract_class_vs_interface.shapes.Shape;
import day57_abstraction_polymorhism.abstract_class_vs_interface.shapes.Square;

public class InstanceOf {
    public static void main(String[] args) {
        //instance of  operator
        Shape shape = new Square();
        //Shape shape = new Circle();
        System.out.println(shape instanceof Circle);
        System.out.println(shape instanceof Square);
        if(shape instanceof Circle){
            System.out.println("it is a circle object");
        }else if (shape instanceof Square){
            System.out.println("it is a square object");
        }
        /*
        java reflection Api
         */
        System.out.println(shape.getClass().getSimpleName());//just class name of object
        System.out.println(shape.getClass().getName());//just class name of object and packege
        if(shape.getClass().getSimpleName().equals("square")){
            System.out.println("it is a square object");
        }
        System.out.println(shape.getClass().getDeclaredMethods().length);

        WebElement el = new Link();
        System.out.println("object class name of el variable = "+ el.getClass().getSimpleName());
        //System.out.println(el.getClass().getDeclaredFields());
    }
}
