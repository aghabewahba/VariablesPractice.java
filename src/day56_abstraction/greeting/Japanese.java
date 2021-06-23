package day56_abstraction.greeting;

public class Japanese implements Greeting{
    @Override
    public void hi() {
        System.out.println("salam");
    }

    @Override
    public void bye() {
        System.out.println("shaw");

    }
}
