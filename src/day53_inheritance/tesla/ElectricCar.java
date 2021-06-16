package day53_inheritance.tesla;

public class ElectricCar {
    private String make;
    private String model;
    private double price;
    private int year;
    private int range;
    private static int count;//all object will share this vairable
    public static final int MAX_RANGE = 400;

    public ElectricCar(String make, String model, double price, int year, int range) {
        setMake(make);//the same this.make ,reuse the code
       // this.make = make;
        this.model = model;
        this.price = price;
        this.year = year;
        this.range = range;
        count++;
    }

    public final void charge(){
        System.out.println("charging electric car using plug-in");
        this.range = MAX_RANGE;
    }
    public static int getCount(){
        return count;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", range=" + range +
                '}';
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    protected void drive(int miles){
        if(range==0 ||range - miles < 0){
            System.out.println("error : cannot drive that far need to charge");
        }else{
            range-= miles;
            System.out.println("driving " + miles + "miles---");
        }

    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
