package day50_inheritance;

public class EBook extends Book{
    int size;
    int pages;

    public void readBook(){
        System.out.println("Reading book");
        System.out.println("size = " + size);
        System.out.println("title = " + title);
        System.out.println("pages = " + pages);
        System.out.println("author = " + author);
    }

}
