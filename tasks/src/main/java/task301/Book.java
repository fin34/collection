package task301;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private int yearOfPublish;

    public Book(String title, String author, int yearOfPublish){
        this.title = title;
        this.author = author;
        this.yearOfPublish = yearOfPublish;
    }

    public int getYearOfPublish(){
        return yearOfPublish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublish == book.yearOfPublish &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearOfPublish);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                '}';
    }
}
