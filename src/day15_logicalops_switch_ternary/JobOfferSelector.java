package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Honolulu";
        double salary = 120_000.0;
        boolean IsRemote = true;
        boolean HasBenefits =false;
        if (location .equals ("Honululu") && salary >= 120_000.0 && IsRemote && HasBenefits){
            System.out.println("Sur i will accept tis offer");
        }else{
            System.out.println("Lets consider another offer or negotiate");
        }

    }
}
