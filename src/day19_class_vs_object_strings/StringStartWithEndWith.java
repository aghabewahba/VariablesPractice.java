package day19_class_vs_object_strings;

public class StringStartWithEndWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("i"));
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("intellij"));
        System.out.println(word.startsWith("intellij idea"));
        System.out.println("java".startsWith("j"));


        System.out.println("word".startsWith("Int"));

        System.out.println("word".startsWith("idea"));
        System.out.println("word".startsWith("a"));

        String firstName = "Dr . Nadir";
        if (firstName.startsWith("Mr.")) {
            System.out.println("Man");
        } else if (firstName.startsWith("Dr.")) {
            System.out.println("Doctor");
        } else if (firstName.startsWith("Mrs.")) {
            System.out.println("woman");
        }else{
            System.out.println("Normal name");
        }

    }
}