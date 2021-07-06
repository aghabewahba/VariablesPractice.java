package day59_polymorphisim_execption;

public class WebElementUtil {
    public static void clickElement(WebElement element){
        System.out.println("clicking on Element");
        element.click();

    }
    public static WebElement getLinkWithText(String txt){
        System.out.println("searching for a link with txt="+ txt);
        return new Link();
    }
}
