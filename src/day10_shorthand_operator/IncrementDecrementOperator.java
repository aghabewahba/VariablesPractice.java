package day10_shorthand_operator;

public class IncrementDecrementOperator {
    public static void main(String[] args) {
        int i =1;
        System.out.println("i = + " + i);
        i++;
        System.out.println("i = " + i) ;
        i++;
        i++;
        i++;
        i++;
        System.out.println("i = " + i) ;
        int linesOfCode = 15;
        System.out.println("linesOfCode = " + linesOfCode);
        linesOfCode = linesOfCode + 1;
        linesOfCode += 1;
        ++linesOfCode;
        linesOfCode++;
        //++linesOfCode++; error
        System.out.println("linesOfCode = " + linesOfCode);
       


        linesOfCode = linesOfCode - 1;





    }
}
