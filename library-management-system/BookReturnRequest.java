package collection;

public class BookReturnRequest {
    private final int bookId;
    private final String borrowerName;
    
    public BookReturnRequest(int bookId, String borrowerName) {
        this.bookId = bookId;
        this.borrowerName = borrowerName;
    }
    
    public int getBookId() { return bookId; }
    public String getBorrowerName() { return borrowerName; }
}