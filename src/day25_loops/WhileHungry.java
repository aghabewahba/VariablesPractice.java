package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true ;
        int banana = 0;
        int countToFull = 3;
        while(isHungry ){
            banana++;
            System.out.println("Eating a banana:" + banana);
            if(banana == countToFull){
                isHungry = false;
            }

        }
        System.out.println("Had enough bananas .lets get back to study");
    }
}
