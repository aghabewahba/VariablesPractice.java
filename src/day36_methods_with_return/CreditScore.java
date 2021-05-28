package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(815);
        checkEligible(700);
        checkEligible(400);
        //System.out.println(checkEligible(711));====>Error print void method
        System.out.println(getCreditScore());
        System.out.println("getCreditScore = " + getCreditScore());
        int score =  getCreditScore();
        System.out.println("score = "+ score);

    }
    public static void checkEligible(int creditScore){
        if(creditScore >= 700){
            System.out.println("you are eligible for leasing a car");
        }else{
            System.out.println("you are not eligible for leasing a car");
        }
    }
    public static int getCreditScore(){

        return 800;
    }
}
