package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int [] nums = new int[3] ;//array variable
        nums[0]=5;
        nums[1]=7;
        nums[2]=10;
        System.out.println("value at index 0 =" +nums[0]);
        System.out.println("value at index 1 =" +nums[1]);
        System.out.println("value at index 2 =" +nums[2]);
        
        //how to find size of array
        System.out.println("number of element=" +nums.length);
        //store length of array into len variable
        int len = nums.length;
        System.out.println("len = " + len);

        //change value in the array
        nums[0]= 100;
        nums[1]=300;
      //  read the value of index 1 and assign same to index 2
        nums[2]=nums[1];
        System.out.println("nums[0]=" +nums[0]);
        System.out.println("nums[1] =" +nums[1]);
        System.out.println(" nums[2] =" +nums[2]);

    }
}

