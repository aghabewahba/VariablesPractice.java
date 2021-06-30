package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {
        //variable of worker and object of superman
        Worker worker =new SuperMan();
        worker.work("QA manager");
        worker.getPaid();

        ((Father)worker).raiseKid();
        ( (SuperMan)worker).playWithKid();
        //Dowen casting from worker to superman
        SuperMan superMan= (SuperMan) worker;
        superMan.feedKid();
        superMan.work("java dev");
    }
}
