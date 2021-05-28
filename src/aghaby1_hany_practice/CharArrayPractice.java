package aghaby1_hany_practice;

public class CharArrayPractice {
    public static void main(String[] args) {
        char[]letter ={'j','a','v','a',' ','i','s',' ', 'f','u','n'};
        for(char eachLetter: letter){
            System.out.print(eachLetter +" ");
        }
        String sentence =new String(letter);
        System.out.println("\n sentence =" + sentence);



        String item ="wooden spoon";
        char[]itemArray = item.toCharArray();
        System.out.println("itemArray.length =" + itemArray.length);
        System.out.println("item.length()=" + item.length());



        String[] fruits ={"apple", "banana", "kiwi"};
        String fruitStr = "";
        for(String each : fruits){
            System.out.print(each +"-");
            fruitStr +=each +"-";
        }
        System.out.println("\n fruitStr =" +fruitStr);

    }
}
