package day56_abstraction;

import day56_abstraction.drivable.SelfDrivable;
import day56_abstraction.drivable.Transportation;
import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void autoPiloting() {
        System.out.println("flying on Auto-pilot mode");
    }

    @Override
    public void transportPeople() {
        System.out.println("flying people from city to another");

    }

    @Override
    public void cost(int mile) {
        System.out.println("plane coast " + (mile * 25.0)+ "to fly"+ mile +"miles");

    }

    @Override
    public void hi() {
        System.out.println("welcome");

    }

    @Override
    public void bye() {
        System.out.println("thank you for using egypt air ");

    }

    public void land() {
        System.out.println("the fly land on time");
    }
}
