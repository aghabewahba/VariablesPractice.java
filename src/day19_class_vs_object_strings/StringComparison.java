package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Egypt";
        //EQUALS() method- case sensitive
        System.out.println(city .equals("Egypt"));//true
        System.out.println(city .equals("egypt"));//false
        System.out.println(city .equals("EGYPT"));//false

        //EQUALSIGNORECASE
        System.out.println(city .equalsIgnoreCase("Egypt"));//true
        System.out.println(city .equalsIgnoreCase("egypt"));//true
        System.out.println(city.equalsIgnoreCase("EGYyPT")); //false
        System.out.println(city.equalsIgnoreCase("EGY pt")); //false
        System.out.println(city.equalsIgnoreCase("EgYpT"));//true


        if(city.equals("Egypt")) {
            System.out.println("equals() true");
    }else{
        System.out.println("equals() false");
    }

        if(city.equalsIgnoreCase("EGYPT")) {
        System.out.println("equalsIgnoreCase() true");
    }else {
        System.out.println("equalsIgnoreCase() false");
    }



    }
}
