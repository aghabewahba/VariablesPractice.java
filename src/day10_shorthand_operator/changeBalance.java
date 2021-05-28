package day10_shorthand_operator;

public class changeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        //decrease balance by baklava price
        balance = balance - baklava;
        System.out.println("balance after baklava= " + baklava);
        
        double kanafa = 44.45;
        System.out.println("kanafa = " + kanafa);
        balance = balance  - kanafa;
        System.out.println("balance after kanafa = " + balance);
        
        //socond kanafa is 50% off. lets buy it 
        kanafa = kanafa /2;
        System.out.println("kanafa = " + kanafa);
        //buy it and decrease balance with kanafa price
        balance = balance - kanafa;
        System.out.println("balance after second kanafa = " + balance);
        double ploy = 7.99;
        System.out.println("ploy = " + ploy);
        balance = balance - ploy;
        System.out.println("balance after ploy = " + balance);
        double iceTea = 3.0;
        System.out.println("iceTea = " + iceTea);
        //buy 4 iceTea and decrease balance
        balance = balance - iceTea  *4;
        System.out.println("balance after 4 iceTeas = $ " + balance);

        //return baklava
        System.out.println("return baklava = " + baklava);
        balance = balance + baklava;
        System.out.println("balance after returning baklava = $ " + balance);
    }
}
