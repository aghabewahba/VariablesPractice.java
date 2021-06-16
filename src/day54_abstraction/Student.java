package day54_abstraction;

public abstract class Student {
    //Student student = new Student error because we cannot creat object on abstract class
    public void code(String language){
        System.out.println("Student is coding " + language);
    }
    public abstract void attendClass();




}
