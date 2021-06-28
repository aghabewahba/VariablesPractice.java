package day57_abstraction_polymorhism.abstract_class_vs_interface;

public abstract class AbstractA {


    int num1;
    private double price;
    public static int count;
    public final String Type = "abstract";
    public static final String LANGUAGE="java";

    public AbstractA(){
        System.out.println("AbstractA constructor");
    }

    public abstract void absMethodA();
    //privat abstract void absMethodA();
    //  public static abstract void absMethodA();
    //  public  final abstract void absMethodA();--->abstract cannot be static or privat or final
    //also
    public void methodB(){
        System.out.println("methodB is called");
    }
    public static void staticMethodC(){
        System.out.println("MethodC is called");
    }
}
