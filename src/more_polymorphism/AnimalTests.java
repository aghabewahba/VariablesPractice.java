package more_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTests {
    public static void main(String[] args) {
        Animals a1 = new Animals();//not polymorphic ,data type and object type are same
        a1.makeNoise();

        //polymorphisme - polymorphic way
        //parent type = new child type
        Animals animals1= new Dog();
        Animals animals2 = new Horse();
       // Animals animals3 = new Cat();
        Animals cat = new Cat();
        animals1.makeNoise();
        animals2.makeNoise();
        cat.makeNoise();

        List<Animals> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Horse());
        listOfAnimals.add(new Cat());

    }
}
