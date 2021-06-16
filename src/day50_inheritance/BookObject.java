package day50_inheritance;

public class BookObject {
    public static void main(String[] args) {
        Book book= new Book();
        book.title = " intro to java";
        book.author = "Savitch";
        book.type = "programmer";
        book.price = 85.5;

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        AudioBook audioBook =new AudioBook();
        audioBook.author ="Unmesh";
        audioBook.length = 60;
        audioBook.narrator = "Irina";
        audioBook.price =44.66;
        audioBook.type = "Automation";
        audioBook.listen();

        EBook ebook= new EBook();
        ebook.title = " Maven";
        ebook.author = "HTML";
        ebook.type = "programmer";
        ebook.price = 150.0;
        ebook.pages = 400;
        ebook.readBook();
    }
}
