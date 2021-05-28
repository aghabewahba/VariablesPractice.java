package day35_method_with_param;

public class Email {
    public static void main(String[] args) {
        buildEmail("Nadir" , "FannieMee");
    }
    public static void  buildEmail(String name, String domain){
        String email =name + "@" + domain + ".com";
        System.out.println(email);

    }
}
