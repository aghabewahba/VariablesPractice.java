package day57_abstraction_polymorhism.abstract_class_vs_interface;

public class Runner {
    public static void main(String[] args) {
        /**
         * we cannot add object neither of them
        AbstractA absA = new AbstractA() ;
        InterfaceA iA =  new InterfaceA();
        */
        InterfaceA.staticMethodE("wooden spoon");
       // ConcreteA.staticMethodE("hello);->staticMethodE work only
    }
}
