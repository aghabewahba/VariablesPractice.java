package OfficeHours.Practice_03_02_2021;

public class HouseBuyer {
    public static void main(String[] args) {
        String name = "canyon";
        double price, rating;
        boolean gated, allowsPets;

        switch (name){
            case "Hills":
                price = 4500;
                rating = 4.0;
                gated =true;
                allowsPets = false;
                break;
            default:
                name = "Invalid name";
                price = 0;
                rating = 0;
                gated =true;
                allowsPets = false;

        }
        System.out.println("name = " + name);
        System.out.println("price = " + price);
        System.out.println("rating " + rating);
        System.out.println("gated =" + gated);
        System.out.println("allowsPets =" + allowsPets);
    }
}
