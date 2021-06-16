package day54_abstraction;

public class Pizza extends MenuItem{
    @Override
    public void prepare() {
        System.out.println("stretch  dough , and put topping");

    }

    @Override
    public void serve() {
        System.out.println("serve it  in box");

    }
}
