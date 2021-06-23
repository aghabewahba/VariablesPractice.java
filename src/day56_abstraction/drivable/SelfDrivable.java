package day56_abstraction.drivable;

public interface SelfDrivable {
    void autoPiloting();
    //void selfPark (); this cause a error in sub class because they must override abstruct method
    public default void selfPark(){
        System.out.println("preforming self park");
    }


}
