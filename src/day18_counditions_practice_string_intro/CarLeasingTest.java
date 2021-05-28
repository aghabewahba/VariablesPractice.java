package day18_counditions_practice_string_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String Make = "Mercedes";
        String model ="E";
        double leasePrice = 0.0;
        if(Make .equals ("Mercedes") && model .equals ("E")){
            leasePrice = 500.0;
       }else if (Make .equals ("Mercedes") && model .equals ("A")){
           leasePrice=400.0;
        }

        System.out.println("make =" +Make);
        System.out.println("model =" +model);
        System.out.println("leasePrice =" + leasePrice);
    }
}
