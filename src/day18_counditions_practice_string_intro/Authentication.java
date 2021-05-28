package day18_counditions_practice_string_intro;

public class Authentication {
    public static void main(String[] args) {
        int last4ssn = 1234;
        int pincode = 5678;
        int expLast4ssn= 1234;
        int expPincode =1111;
        if (last4ssn == expLast4ssn && pincode ==expPincode){
            System.out.println("Authentication successful");
        }else{
            System.out.println("Authentication  unsuccessful");
            if(last4ssn != expLast4ssn){
                System.out.println("Last 4 ssn ont matching");
            }
            if(expPincode != pincode ){
                System.out.println("pin code is incorrect");
            }
        }
    }
}
