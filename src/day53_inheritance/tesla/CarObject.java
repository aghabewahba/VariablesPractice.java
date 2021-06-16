package day53_inheritance.tesla;

public class CarObject {
    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Tesla ", "Model y", 48190.0, 2021, 326);
        ec1.drive(50);
        System.out.println(ec1.toString());
        System.out.println("ec1 make = " + ec1.getMake());
        System.out.println(" ec1 model" + ec1.getModel());
        System.out.println("ec1 price " + ec1.getPrice());
        System.out.println("ec1 year " + ec1.getYear());
        System.out.println("ec1 rang" + ec1.getRange());


            if (ec1.getPrice() > 10000) {
                System.out.println(ec1.getMake() + "-" + ec1.getModel() + "it is out of my budget");
            } else {
                System.out.println("purchasing "+ ec1.toString());

            }
        System.out.println(ElectricCar.getCount());
            ElectricCar ec2= new ElectricCar("Tesla ","Cybertruk",59900,2022,300);
        System.out.println(ec2.toString());
        System.out.println("count " + ec2.getCount());
        System.out.println("count = " +ElectricCar.getCount());

        Roadster roadster=new Roadster("Roadster", 200000,2022,620);
        System.out.println(roadster.toString());
        roadster.drive(1000);
        roadster.drive(600);
        System.out.println(roadster.getCount());

        ModelX modelX= new ModelX("Tesla","MdelX",84000,2021,360);
        System.out.println(modelX.toString());
        modelX.drive(10);
        System.out.println("having lunch");
        modelX.drive(10);
        System.out.println("range remaning=" + modelX.getRange());
        System.out.println("Total elictric cars count" + ElectricCar.getCount());

        }
    }
