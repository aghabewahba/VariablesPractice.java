package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 5;
        /**
         * if number less than 1 or more than 10
         * print "ERROR: invalid input"
         * exit main method: return;
         */


        if(number < 1 || number > 10){
            System.out.println("Error : invalid input");
            return;
        }

        for(int i = 1 ; i<= 10; i++){
            System.out.println(number + " x " + i + " = " +(number * i));
        }

    }
}
