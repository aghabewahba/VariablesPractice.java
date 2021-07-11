package day60_exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        String word = "java";
        //String word = null;
        try {
            //System.out.println(10/0);
            System.out.println("word =" + word);
            System.out.println("length =" + word.length());
            System.out.println(word.substring(2));
        }catch(NullPointerException e){
            System.out.println("NullPointerNullPointerException caut and handled");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Index is wrong");
        }catch (Throwable t){//this is the parent of all exceptions - parent type exception must be at the end
            System.out.println("Exception is caught ");
            System.out.println("Reason =" + t.getCause());
        }
        System.out.println("---more code after try catch---");
    }
}