package day16_switch_ternary;

public class FloorSelector {
    public static void main(String[] args) {
        int floorNum = 1;
        if(floorNum == 1){
            System.out.println("Floor 1  selected .Companies :Lobby , Varizon, Starbuks");
        }else if(floorNum == 2){
            System.out.println("Floor 2 selsct. Companies: Cybertek, Nasa, Intelsat");
        }else if(floorNum == 3){
            System.out.println("Floor 3 selsct . CompaniesLyft, Bofa, stake hous");
        }else{
            System.out.println("Invalid floor-: " +floorNum);
        }
        System.out.println("==========Switch Stetment version ===========");

        floorNum = 1;
        switch (floorNum){
            case 1:
                System.out.println("Floor 1  selected .Companies :Lobby , Varizon, Starbuks");
                break; //Exit switch
            case 2 :
                System.out.println("Floor 2 selsct. Companies: Cybertek, Nasa, Intelsat");
                break;//exit swetch stetment
            case 3 :
                System.out.println("Floor 3 selsct . CompaniesLyft, Bofa, stake hous");
                break;
            default:
                System.out.println("Invalid floor-: "+ floorNum);
                break;
        }
    }
}
