package day50_inheritance;

public class inheritanceTast {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Bakyt";
        p1.age = 30;

        p1.talk();
        p1.walk();
        p1.work("SDET");

        Teacher t1 = new Teacher();
        t1.teacherID = 1234;
        t1.name = "Saim";
        t1.age = 25;
        t1.talk();
        t1.walk();

        Student student =new Student();
        student.name = "Ali";
        student.age = 33;
        student.talk();
        student.walk();
        student.work("java programmer");
        student.school = "CyberteckSchool";
        student.study("java programming");

    }
}