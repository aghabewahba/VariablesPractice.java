package day55_abstraction.exercise_example;

public abstract class Exercise {
    public void start(){//non abstract method
        System.out.println("warming up and start exercise");
    }
    /*
    *abstract method --> method without body just signature
     */
    public abstract void perform();
    /*
    *
     */
    public abstract int getCaloriesCount(int minutes);
}
