package day56_abstraction.drivable;

import day56_abstraction.greeting.Greeting;

public class Tesla extends Transportation implements SelfDrivable , Greeting {
    @Override
    public void transportPeople() {
        System.out.println("tesla is transporting people");
    }

    @Override
    public void cost(int mile) {
        System.out.println("tesla coast " + (mile * 0.10)+ "to drive"+ mile +"miles");

    }

    @Override
    public void autoPiloting() {
        System.out.println(" tesla is automatic car");
    }

    @Override
    public void hi() {
        System.out.println("tesla is saying hi");
    }

    @Override
    public void bye() {
        System.out.println("bye bye tesla");

    }
}
