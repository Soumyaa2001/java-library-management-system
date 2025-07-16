package collection;

import java.util.*;

public class Library {
    private final List<Book> availableBooks = new ArrayList<>();
    private final Set<String> memberIds = new HashSet<>();
    private final Map<Integer, String> bookBorrowerMap = new HashMap<>();
    private final Queue<BookReturnRequest> pendingReturns = new LinkedList<>();
    
    public void addBook(Book book) {
        for (Book b : availableBooks) {
            if (b.getId() == book.getId()) {
                throw new IllegalArgumentException("Book ID already exists");
            }
        }
        availableBooks.add(book);
    }
    
    public void registerMember(Member member) {
        if (memberIds.contains(member.getId())) {
            throw new IllegalArgumentException("Member ID already exists");
        }
        memberIds.add(member.getId());
    }
    
    public void borrowBook(int bookId, String memberId, String borrowerName) {
        if (!memberIds.contains(memberId)) {
            throw new IllegalArgumentException("Not a registered member");
        }
        
        Book foundBook = null;
        for (Book book : availableBooks) {
            if (book.getId() == bookId) {
                foundBook = book;
                break;
            }
        }
        
        if (foundBook == null) {
            throw new IllegalArgumentException("Book not available");
        }
        
        availableBooks.remove(foundBook);
        bookBorrowerMap.put(bookId, borrowerName);
        pendingReturns.add(new BookReturnRequest(bookId, borrowerName));
    }
    
    public void processReturns() {
        while (!pendingReturns.isEmpty()) {
            BookReturnRequest request = pendingReturns.remove();
            bookBorrowerMap.remove(request.getBookId());
            availableBooks.add(new Book(request.getBookId(), "Returned Book"));
        }
    }
    
    public List<Book> getAvailableBooks() {
        return new ArrayList<>(availableBooks);
    }
    
    public Set<String> getMemberIds() {
        return new HashSet<>(memberIds); 
    }
    
    public Map<Integer, String> getBookBorrowerMap() {
        return new HashMap<>(bookBorrowerMap); 
    }
}