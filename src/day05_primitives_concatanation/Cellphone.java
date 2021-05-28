package day05_primitives_concatanation;

public class Cellphone {
    public static void main(String[] args){
        String brand = "Apple";
        String model = "iphone 11";
        String color = "green";
        double price = 699.0;
        int storege =256;
        boolean hasCamera = true;

        System.out.println(brand);
        System.out.println(model);
        //WITH MASSAGE
        System.out.println("Brand is " + brand);
        System.out.println("Model is " + model);
        System.out.println("Color is " + color);
        System.out.println("Price is $ " + price);
        System.out.println("Sorege is " + storege + "GB");
        System.out.println("Has camera? -" + hasCamera);
    }
}
