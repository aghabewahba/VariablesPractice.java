package day29_nestedloop_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {
        for (int outer = 1; outer <= 5; outer++) {
            for (int stars = 1; stars <= 10; stars++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int outer = 1; outer <= 10; outer++) {
            for (int stars = 1; stars <= outer; stars++) {
                System.out.print("\uD83C\uDF54 ");
            }
            System.out.println();
        }
        for (int outer = 1; outer <= 10; outer++) {
            for (int stars = 10; stars >= outer; stars--) {
                System.out.print("\uD83C\uDF54 ");
            }
            System.out.println();
        }
    }
}