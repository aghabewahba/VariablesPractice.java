package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("! true = " + (!true));
        System.out.println("!false = "+ (false));

        int age = 2;
        if(!(age > 7)){
            System.out.println("Need to sit in child car seat . age =" + age);
        }else{
            System.out.println("can sit in normal seat ." + age);
        }
    }
}
