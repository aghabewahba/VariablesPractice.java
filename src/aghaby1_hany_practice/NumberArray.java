package aghaby1_hany_practice;

public class NumberArray {
    public static void main(String[] args) {
        int[]nums = new int [100];
        int leng = nums.length;
        System.out.println("leng :" + leng);
        for(int i=0;i<nums .length;i++){
            nums[i]=i+1;

        }
          for(int eachNumber : nums){
              System.out.print(eachNumber+ " ,");

          }


    }

}
