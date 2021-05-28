package day19_class_vs_object_strings;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CyberTek";
        //convert word to all lowercase
        System.out.println(word .toLowerCase() );
        System.out.println("java" .toLowerCase());
        word . toLowerCase();
        System.out.println(word);
        String wordInLcase = word . toLowerCase();
        //change word to all lower case
        word = word . toLowerCase();
        System.out.println("word =" + word);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - " + company.toUpperCase());
        System.out.println("java".toUpperCase());

        //change variable company "Amazon" to "AMAZON"
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);
    }
}
