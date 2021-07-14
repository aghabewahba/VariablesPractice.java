package day62_collections;
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        List<String> cities = new ArrayList<>(); //polymorphism
        Collection<String> schools = new ArrayList<>();//polymorphism

        cities.add("Mclean") ;//add method from collection or list interface
        cities.add("vienna") ;
        cities.add("New york") ;
        cities.add("New york") ;
        System.out.println(cities);

        System.out.println("first city :" + cities.get(0));
        System.out.println("count of cities = " + cities.size());
    }
}
