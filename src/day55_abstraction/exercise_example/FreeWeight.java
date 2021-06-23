package day55_abstraction.exercise_example;

public class FreeWeight extends Lifting{
    @Override
    public void perform() {
        System.out.println("performing lifting free weight dumbbells");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 6;
    }

    @Override
    public void endLift() {
        System.out.println("carefully re-rack dumbbells");

    }
}
