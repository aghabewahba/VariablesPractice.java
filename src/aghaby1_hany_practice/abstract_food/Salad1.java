package aghaby1_hany_practice.abstract_food;

public class Salad1 extends Sandwich implements Bread{
    @Override
    public void prepared() {
        System.out.println("prepared with fresh veggies");
    }

    @Override
    public void serve() {
        System.out.println("served with love");

    }

    @Override
    public void whiteBread() {

    }
}
