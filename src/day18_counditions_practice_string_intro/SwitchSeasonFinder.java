package day18_counditions_practice_string_intro;

public class SwitchSeasonFinder {
    public static void main(String[] args) {
        int month = 3;
        switch (month){
            case 12: case 1: case 2:
                System.out.println("winter");
                break;
            case 3: case 4: case 5:
                System.out.println("Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("invalid month :" + month);

        }
    }
}
