package collection;

public class Book {
    private final int id;
    private final String title;
    
    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }
    
    public int getId() { return id; }
    public String getTitle() { return title; }
    
    public String toString() {
        return "Book ID: " + id + ", Title: " + title;
    }
}
