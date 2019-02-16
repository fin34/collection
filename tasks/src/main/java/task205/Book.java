package task205;

public class Book {

    private String title;
    private int yearOfPublish;

    public Book(String title, int yearOfPublish) {
        this.title = title;
        this.yearOfPublish = yearOfPublish;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                '}';
    }
}
