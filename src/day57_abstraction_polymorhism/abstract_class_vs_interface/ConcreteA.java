package day57_abstraction_polymorhism.abstract_class_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA,InterfaceB {

    @Override
    public void absMethodA() {
        System.out.println("absMethod implementation  is called");
    }
    @Override
    public void methodB(){
        System.out.println("methodB overridding version ic called");
    }
    //@override-> static method are hidden
    public static void staticMethodC(){
        System.out.println("staticMethodC hidden version is called");
    }

    @Override
    public void absMethodD(int num) {
        System.out.println("absMethodD overredden version is called "+ num);
    }
}
