package task205;

import java.util.LinkedList;
import java.util.List;

public class BookMain {

    public static void main(String[] args) {

        List <Book> listOfBooks = new LinkedList<>();
        listOfBooks.add(new Book("Dobromir", 2001));
        listOfBooks.add(new Book("Wrotki", 1999));
        listOfBooks.add(new Book("Pan Tadeusz", 1992));

        for (Book book:listOfBooks) {
            if(book.getYearOfPublish()<=2000){
                System.out.println(book.toString());
            }
        }
    }
}
