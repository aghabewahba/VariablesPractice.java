package day09_scanner_practice;

public class SpeedChekV1 {
    public static void main(String[] args) {
        int speedLimit = 55;
        int currentSpeed = 75;
        int overTheLimit = currentSpeed - speedLimit;
        System.out.println("you are driving " + overTheLimit + "mph over the limit.slow dowen!" );
    }
}
