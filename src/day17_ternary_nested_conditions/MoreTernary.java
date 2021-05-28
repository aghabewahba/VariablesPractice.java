package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = (hourlyRate > 45) ? "accept" : "reject";


        String todaysClass = "java";
        String teacher =(todaysClass .equals( "java"))? "Saim / Morudil": "Nadir";
        System.out.println(" Today's teacher = " + teacher);

    }
}
