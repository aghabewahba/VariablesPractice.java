package day04_varibles_intro;

public class VariableNamingRules {
    public static void main(String[] args){
       // System.out.println("Break Till 4:10 PM ");
        //int static =22; -> error ,static is reserved by java
        int _static = 22;
        int $static = 44;
        int staticVar = 234;

        int salary$ =55;
        //int 1stMonthSalary =3000;->error, cannot start with number
        int $ =10;
        int _ = 3;
        System.out.println($);
        System.out.println(_);
        //Above variables work fin, but not recommended.
        //we should use neamingful variable names
        //int number-of-friends = 400 -> Error
        int numberOfFriends =401;
        int number_of_friends = 401; //not convention

        //int 1stNum =
    }
}
