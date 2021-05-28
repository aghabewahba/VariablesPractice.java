package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade ='A';
        if( grade == 'A'|| grade == 'B' || grade == 'C'){
            System.out.println(" passed. with grade-" + grade);
        }else if(grade =='D' ){
                System.out.println("Will qualify for retake-" + grade);
            } else if(grade == 'E'){
                System.out.println("will be fail-" + grade);
            }else{
                System.out.println("grade will be invalid-" + grade);
        }
    }
}
