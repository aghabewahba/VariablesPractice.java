package day54_abstraction;

public abstract class MyAbstractionClass {
    int num = 55;
    public void learn(){

        System.out.println("Learning----");
    }
    public abstract void close();
}
class Sub extends  MyAbstractionClass{
    public void close(){
        System.out.println("close - abstract method implementation");
    }

}
class MyObjects {
    public static void main(String[] args) {
      // MyAbstractionClass mac = new MyAbstractionClass() ;
        Sub sub=new Sub();
        sub.learn();
        System.out.println(sub.num);
        sub.close();

    }
}

