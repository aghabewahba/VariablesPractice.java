package day58_polymorphism;

public class SuperManTest {
    public static void main(String[] args) {
      Father spMan1 = new SuperMan();
      spMan1.playWithKid();
      spMan1.feedKid();
      spMan1.raiseKid();
     // spMan1.work("SDET");error spman is father type can only access method in father
        Worker spMan2 = new SuperMan();
        spMan2.work("SDET");
        System.out.println("got paid $"+ spMan2.getPaid());
        //spMan2.raiseKid(); error
        SuperMan spMan3 = new SuperMan();
        spMan3.getPaid();
        spMan3.work("scrum master");
        spMan3.feedKid();
        spMan3.playWithKid();
        spMan3.raiseKid();

    }
}
