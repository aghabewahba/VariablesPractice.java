package day45_oop;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount =" + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill =" +myCoffee.getAmount() );
        myCoffee.drink(10);
        System.out.println("amount after drink 10 ="  +myCoffee.getAmount() );
      //  myCoffee.type = "Turkish coffee";
        myCoffee.setType("Turkish coffee");
        System.out.println("My coffee = " + myCoffee.getType());
//describe my coffee - showw all variable value
        System.out.println(myCoffee.toString());

        //Add another coffee object ,set value , call methods
        Coffee coffee1 =new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 typr =" + coffee1.getType());
        //assign coffee object to coffee2
        //hey java, coffee2 to same object as coffee1
        Coffee coffee2 = coffee1;
        System.out.println("coffee2 type =" + coffee2.getType());
        coffee2.setType("Espresso");
        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappucino");
        coffee3 = coffee2;
        System.out.println("coffee3 type ="+ coffee3.getType() );

        Coffee coffee4 = null;//reference
        coffee4.setType("turkish");//nullpointException


    }
}
