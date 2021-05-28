package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size ="tall";
        double price = 0;
        double calorise = 0;

        switch (size){
            case "tall":
                System.out.println("Tall Cappuccino please ");
                price = 3.69;
                calorise = 90;
                break;
            case "grande":
                System.out.println("Grande Cappuccino please");
                price = 3.99;
                calorise =120;
                break;
            case "venti":
                System.out.println("Venti Cappuccino please");
                price = 4.29;
                calorise =150;
                break;
                default:
                    System.out.println("We don't have that " + size + "Cappuccino");
        }
        System.out.println("Total price: " + price);
        System.out.println("you will consume : " + calorise +"cals of energy");

    }
}
