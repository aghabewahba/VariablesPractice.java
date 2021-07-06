package aghaby1_hany_practice.abstract_food;

public class Salad1 extends Sandwich{
    @Override
    public void prepared() {
        System.out.println("prepared with fresh veggies");
    }

    @Override
    public void serve() {
        System.out.println("served with love");

    }
}
