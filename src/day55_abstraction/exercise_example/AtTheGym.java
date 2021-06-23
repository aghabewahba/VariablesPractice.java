package day55_abstraction.exercise_example;

public class AtTheGym {
    public static void main(String[] args) {
        Exercise exercise  = new Running();//polymorphism
        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeWeight = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("running 30 min - calories = " + exercise.getCaloriesCount(30));

        exercise.start();
        exercise.perform();
        System.out.println("swimming 30 min - calories = " + swimming.getCaloriesCount(30));

        exercise.start();
        exercise.perform();
        System.out.println("freeweight 30 min - calories = " + freeWeight.getCaloriesCount(30));

    }
}
