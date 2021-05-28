package aghaby1_hany_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListAsList {
    public static void main(String[] args) {
        //List<Integer>nums = Arrays.asList(23, 1 ,34 , 54, 654);
       //System.out.println("nums = " + nums);
      //  nums.add(100);
       // nums.remove(0);
       // nums.clear();
        List<Integer>nums1= new ArrayList(Arrays.asList(23, 1 ,34,0 , 54, 654));

        nums1.add(100);
        System.out.println("nums1 = " + nums1);
        nums1.remove(0);
        System.out.println("nums1 = " + nums1);
    }
}
