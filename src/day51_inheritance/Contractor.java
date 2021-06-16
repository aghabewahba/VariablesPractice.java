package day51_inheritance;

public class  Contractor extends Employee {
    @Override//1) lets everyone know we are overriding this method
              //2) ensure that this method is being overriding .if
    public double calculateSalary(double hourlyRate){
        return 50 * 40 * hourlyRate;
    }

    @Override
    public String toString() {
        return "Contractor{}";
    }
}
