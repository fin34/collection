package task301;

import java.util.HashSet;
import java.util.Set;

public class BookMain {

    public static void main(String[] args) {

        Book book1 = new Book("Dom", "Nieznany", 2001);
        Book book2 = new Book("Wieczór", "Gabriela", 1999);
        Book book3 = new Book("Ogniem i Mieczem", "Stefan", 2011);

        Set<Book> listOfBooks = new HashSet<>();
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);

        for (Book book:listOfBooks) {
            if(book.getYearOfPublish()<2010){
                System.out.println(book);
            }
        }
    }
}
