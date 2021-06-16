package day53_inheritance.hiding;

public class Mobile extends Phone{
    String type = "Mobile Phone";

    //method hiding
    public static void use(){
        System.out.println("using mobile phone");
    }
    public void text(){
        use();
        System.out.println("send a text message");
    }
    @Override
    public void call(){
        use();
        System.out.println("and calling on mobil");
    }
}
