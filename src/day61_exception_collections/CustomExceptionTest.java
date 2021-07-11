package day61_exception_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int minutes = 30;
        System.out.println("class is going on for " + minutes + "minutes");
        if(minutes > 50){
           // throw new BreakTimeException();
            throw new BreakTimeException("it is break time");
        }
        System.out.println("Lets continue the class");

        double balance = 400.0;
        double itemPrice =500.0;
        System.out.println("I have $" + balance+"and purchasing item for $ " + itemPrice );

        if(itemPrice > balance){
            throw new InsufficientBalanceException("transaction declined . not enough funds");

        }
        System.out.println("Item successfully purchased");
    }
}
