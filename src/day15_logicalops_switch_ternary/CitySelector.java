package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Moscow";

        if(city .equals ("Moscow") || city .equals ("Tampa")){
            System.out.println("willing to relocate to " + city);
        }else{
            System.out.println("Not considering " +city);

        }
    }
}
