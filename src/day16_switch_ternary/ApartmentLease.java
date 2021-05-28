package day16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {
        int numberOfBedroom = 0;
        double startingPrice = 0;

        switch (numberOfBedroom) {
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454.0;
                break;
            case 1:
                System.out.println("One apartment selected");
                startingPrice = 1725.0;
                break;
            case 2:
                System.out.println("Two apartment selected");
                startingPrice = 2899.0;
                break;
            default:
                System.out.println(numberOfBedroom + " bedroom currently available");
                break;
        }
        System.out.println("Starting price : $" + startingPrice);



    }
}
