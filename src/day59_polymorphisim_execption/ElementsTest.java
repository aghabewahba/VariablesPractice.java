package day59_polymorphisim_execption;

public class ElementsTest {
    public static void main(String[] args) {
        Link link = new Link();
        link.click();
        link.getText();
        link.sendKeys("hi");
        link.getLinkHref();

        WebElement loginLink = new Link();
        loginLink.click();
        String txt = loginLink.getText();
        System.out.println("txt = " + txt);

        loginLink.getText();
        loginLink.sendKeys("hello");

        WebElement userName = new InputField();
        userName.sendKeys("wooden spoon");
        userName.click();

      WebElementUtil.clickElement(loginLink);
       WebElementUtil.clickElement(userName);

     WebElement login =  WebElementUtil.getLinkWithText("login");
     login.click();



    }
}
