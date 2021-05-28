package day40_arraylist;
import java.util.*;
public class RawArrayList {
    public static void main(String[] args) {
        //declare raw arraylist
        ArrayList list =new ArrayList();
        List list2 = new ArrayList();

        //add value
        list.add("java");
        list.add("apple");
        list.add("coffee");
        list.add(55.7);
        list.add(true);
        list.add("wooden spoon");

        System.out.println(list);
        System.out.println("size :" + list.size());
    }
}
