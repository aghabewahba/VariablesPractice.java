package day13_conditional_statement;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println(" ****** Welcome to TD Bank ATM ******" );
        int secretPincode = 2233;
        int inputPincode = 2233;

        if (secretPincode ==inputPincode ){
            System.out.println("Welcome to your account");
            System.out.println("you can withdraw, check your palance, deposit");
        }else{
            System.out.println("Incorrect pincode!" + inputPincode);
            System.out.println("pleas try again");
        }
        System.out.println("Thank you for using TD bank ATM");
    }
}
