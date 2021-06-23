package day56_abstraction;

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
