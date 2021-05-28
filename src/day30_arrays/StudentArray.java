package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {

        String[] student1 = {"AJ1234", "Adam", "Jhon", "B22", "703-380-2001"};
        String[] student2 = {"AW1234", "Aghaby", "Wahba", "B22", "703-380-2013"};
        System.out.println("student1 ID =" +student1[0]);
        System.out.println("Student1 firstName"+ student1[1]);
        System.out.println("Student1 lastName" +student1[2]);
        System.out.println("Student1 batch num" +student1[3]);
        System.out.println("Student1mobil num" +student1[4]);
        System.out.println("student data length:  "+student1.length);

        //check if student1 data array contains 5 items.
        // true: PASS: data array has correct length
        //false: FAIL: data array has incorrect length

        /**
         check if student1 and student2 arrays have same number of data
         TRUE: PASS: data arrays length match
         FALSE: FAIL: data arrays length mismatch
         */



        if(student1.length== 5){
            System.out.println("Pass:data array has correct length");
        }else{
            System.out.println("Fail :data array has incorrect length");
        }
        /**
         check if student1 and student2 arrays have same number of data
         TRUE: PASS: data arrays length match
         FALSE: FAIL: data arrays length mismatch
        */
        if(student1 .length ==student2.length){
            System.out.println("pass :data array length match");

        }else{
            System.out.println("fill:data array length mismatch ");
        }
        /**
         read from array and print firstname and lastname in all uppercase
         ADAM SMITH
         */


        System.out.println(student1[1] .toUpperCase() +" " +student1[2]. toUpperCase());
    }
}