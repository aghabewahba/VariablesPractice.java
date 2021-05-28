package day15_logicalops_switch_ternary;

public class UseCarSelector {
    public static void main(String[] args) {
        double budget = 5000.0;
        String model = "Toyota";
        double carPrice = 4500.0;
        if(carPrice <= budget && model .equals("Toyota") || model .equals ("Honda") ){
            System.out.println("Ready to purchase = "  + model  + "price = "  +  carPrice);
        }else{
            System.out.println("Not interested in model = " + model + " ,price " + carPrice);
        }
    }
}
