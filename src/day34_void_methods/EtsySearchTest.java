package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println(" --Starting Etsy search smoke Test--");
               openBrowser ();
                navigateToEtsyUrl();
                searchForWoodenSpoon();
                verifyResultsAreDisplayed();
        System.out.println("--Etsy search smoke completed -pass-");
    }
    public static void openBrowser (){
        System.out.println("Lunching chrome browser");

    }
    public static void navigateToEtsyUrl (){
        System.out.println("Navigattion to https://www.etsy.com");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("Pass:verify Etsy home page is displayed ");
        System.out.println("Type 'Wooden spoon' in search field and click search");
    }
    public static void verifyResultsAreDisplayed(){
        System.out.println("Pass: search results are successfully displayed ");
    }
}
