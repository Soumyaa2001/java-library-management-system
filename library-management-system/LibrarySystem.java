package collection;

//Create a library management system using list for available books , create a set for unique member id's
//Map for mapping the book id --> Borrower name  and queue for pending book returns
//and use a switch case for all these four option
/* 
*1. add a book
*2. Becoming a Member of a library 
*3. to save the borrower name mapped with book id so that you can retrieve the borrower name with id 
*4. for pending book return 
*/

import java.util.Scanner;

public class LibrarySystem {
    private final Library library = new Library();
    private final Scanner scanner = new Scanner(System.in);
    
    public void start() {
        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            try {
                switch (choice) {
                    case 1: addBook(); break;
                    case 2: registerMember(); break;
                    case 3: borrowBook(); break;
                    case 4: processReturns(); break;
                    case 5: exit();
                    default: System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    
    private void printMenu() {
    	System.out.println("----------------------------");
        System.out.println("Library Management System");
        System.out.println("1. Add a Book");
        System.out.println("2. Become a Library Member");
        System.out.println("3. Borrow a Book");
        System.out.println("4. Process Pending Returns");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }
    
    private void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book ID: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();
        
        library.addBook(new Book(bookId, title));
        System.out.println("Book added successfully!");
    }
    
    private void registerMember() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter unique member ID: ");
        String memberId = scanner.nextLine();
        
        library.registerMember(new Member(memberId, name));
        System.out.println("Registration successful!");
    }
    
    private void borrowBook() {
        System.out.print("Enter your member ID: ");
        String memberId = scanner.nextLine();
        System.out.print("Enter book ID to borrow: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        library.borrowBook(bookId, memberId, name);
        System.out.println("Book borrowed successfully!");
    }
    
    private void processReturns() {
        library.processReturns();
        System.out.println("All pending returns processed!");
    }
    
    private void exit() {
        System.out.println("Exiting system...");
        System.exit(0);
    }
    
    public static void main(String[] args) {
        new LibrarySystem().start();
    }
}