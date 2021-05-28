package aghaby1_hany_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Aghaby_P1 {
    public static void main(String[] args) {

            ArrayList<Integer>list1 = new ArrayList<>(Arrays.asList(13,27,100,30,103,300));
            ArrayList<Integer>list2 =new ArrayList<>();
           for(int each :list1)
            if(each < 100){
                list2.add(each);
                list1=list2;
                System.out.println(list1);

            }
    }
}
