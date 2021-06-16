package day51_inheritance.super_keyword;

public class Lux extends Lyft{
    @Override
    public double calculateRate(double miles){

        //calculateRate of lyft + 20%
        return super.calculateRate(miles)* 1.2;
    }

}
