package aghaby1_hany_practice;

public class MaxAndMinNumbers {
    public static void main(String[] args) {
        int[] numbers = {33, 60, 23, 1, 12, 123, 5, 77};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("max number :" + max);
        System.out.println("min number :" + min);
    }
}