package day57_abstraction_polymorhism.abstract_class_vs_interface;

public interface InterfaceA {

    public static final String TYPE = "interface";
    double MAX_COUNT =500; //this is also public static final
    //interface can only have final static

   // public InterfaceA(){
      //  System.out.println("constructor is not welcome in interface");
    //}Interface cannot have constructor
    public abstract void absMethodD(int num);

    /**
     * start from java 8 (jdk 1.8)
     * interface can have static and default method
     */
    public static void staticMethodE(String str){
        System.out.println("staticMethodE is called with str "+ str);
    }
    public default void defaultMethodF(){
        System.out.println("defaultMethodF is called");
    }
}
