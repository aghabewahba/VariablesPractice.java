package day59_polymorphisim_execption.exception_handling;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

public class TryCatch {
    public static void main(String[] args) {

        try {
            System.out.println(10 / 2);
            System.out.println(10 / 0);
            System.out.println(10 / 3);
        }catch (Exception e){
            System.out.println("runtimeException happened and handled");
        }
        System.out.println("after first try catch");
        int[] nums = {11, 33, 44};
        try {
                System.out.println(nums[0]);
                System.out.println(nums[3]);
            }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException is caught ");
        }
        System.out.println("after array code");

    }
}
