package day44_custom_classes;

public class MyApps {
    public static void main(String[] args) {
        App app1 = new App();
        app1.name ="Telegram";
        app1.version = 3.4;
        app1.open();

        app1.version =4.0;
        app1.open();
    }
}
