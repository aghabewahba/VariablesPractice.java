package day29_nestedloop_arrays;

public class NestedForLoop {
    public static void main(String[] args) {
        for(int minutes = 1; minutes<= 5; minutes++){
            System.out.println("\n minutes=" + minutes);
            for(int second = 1;second <= 60;second++){
                System.out.print(second+" ");
            }
        }
        for(int minutes = 0; minutes <= 4 ;minutes++){
            for(int seconds = 0; seconds<=59; seconds++){
                System.out.println(minutes + ":" + seconds);

            }
        }
    }
}
