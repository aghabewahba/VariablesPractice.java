package day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress = new Address();//calling the
        cybertekAddress.setStreet("7925 jones Branch Dr Suit 3300");
        cybertekAddress.setCity("Maclean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22182");

        System.out.println("CybertekSchool address: " + cybertekAddress.toString());
        cybertekAddress.setStreet("7925 jones Branch Dr Suit 3200");
        System.out.println("CybertekSchool address: " + cybertekAddress);
        System.out.println("street info = " + cybertekAddress.getStreet());

        Address newAddress = new Address();
        newAddress.setStreet("7925 jones Branch Dr Suit 200");
        newAddress.setCity("Maclean");
        newAddress.setState("VA");
        newAddress.setZipCode("22102");
        System.out.println(newAddress.toString());

        Address papaJhonPizza = new Address("5801 Iyco Rd ste 1A","Vinna","VA", "22182");
        System.out.println("Papa Jhon pizza =" +papaJhonPizza .toString());


    }
}



