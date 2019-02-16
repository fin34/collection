package task302;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Komora", 1990);
        Book book2 = new Book("Raport Pelikana", 1989);
        Book book3 = new Book("Miasto", 1997);

        Deque<Book> queue = new ArrayDeque<>();
        queue.push(book1);
        queue.push(book2);
        queue.push(book3);
        System.out.println("Queue size: " + queue.size());
        queue.pop();
        queue.pop();
        System.out.println("Last deleted book: " + queue.pop());
        System.out.println("Queue size: " + queue.size());
    }
}
