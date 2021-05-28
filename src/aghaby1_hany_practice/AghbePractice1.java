package aghaby1_hany_practice;
import java.util.Scanner;
public class AghbePractice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter season number :\n1-spring \n2-summer\n 3-fall\n4-winter");
        int season = scan.nextInt();
        int day = 0;
        int night = 0;
        String seasonName = "";
        if(season == 1){
            day =14;
            night = 10;
            seasonName = "spring";
        }
        if(season == 2){
            day = 16;
            night =8;
            seasonName = "summer";
        }
        if(season == 3){
          day = 14;
          night =10;
          seasonName ="fall";
        }
        if(season == 4){
            day = 12;
            night =12;
            seasonName ="winter";
        }
        System.out.println("in " + seasonName + "there is" + day + "hours of daylight"
                +night + "hours in nighttime");
    }

}


