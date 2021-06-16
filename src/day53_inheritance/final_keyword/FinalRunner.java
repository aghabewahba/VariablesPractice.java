package day53_inheritance.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
       // TestData.ADMIN_USERNAME ="change";we cannot change value of final variable
        final  int ssn =432112433;
        //ssn= 432341; we canot change final value
    }
}
