package day58_polymorphism;

public class Amazon extends OnlineShopping implements Prime{
    @Override
    public void buy() {
        System.out.println("buy items on amazon.com");
    }

    @Override
    public void sell() {
        System.out.println("sell items on amazon.com");

    }

    @Override
    public void primeShipping() {
        System.out.println("free -2day shipping");
    }
}
