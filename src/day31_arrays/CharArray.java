package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[]letter = {'j', 'a', 'v', 'a', ' ', 'i', 's',' ' ,'f', 'u', 'n'};
        // print each letter using a loop
        for(char eachLetter: letter){
            System.out.print(eachLetter +" ");
        }
        String sentence =new String(letter);
        System.out.println("\n sentence ="+ sentence);


        String item = "wooden spoon";
        char[]itemArray = item. toCharArray();
        System.out.println("itemArray.length =" +itemArray.length);
        System.out.println("item.length() ="+ item.length());

        String[] fruits = {"bananas" , "apple" , "kiwi", "mango" ,"papaya" ,"strawberry"};
        String fruitStr = "";
        for(String each : fruits){
            System.out.print(each +"-");
            fruitStr += each + "-";

        }
        System.out.println("\n fruitStr =" +fruitStr);

        String[] language ={"java" , "python" ,"c++" ,"sql" , "ruby", "javascript"};

        System.out.println(String.join("|", language));
        System.out.println(String.join("##", language));
        String joinedLanguages = String.join(" <> " , language);
        System.out.println("joinedLanguages = " + joinedLanguages);
    }
}
