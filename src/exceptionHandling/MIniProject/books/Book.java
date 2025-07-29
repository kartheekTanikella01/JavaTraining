package exceptionHandling.MIniProject.books;

import exceptionHandling.MIniProject.CustomException.InvalidBookIdException;

import java.util.List;

public abstract class Book {
    private int bookId;
    private String bookName;
    private String bookAuthor;

    private Boolean isAvailable;

    public static final String libraryName="Kartheek's library";
    public static final String Address="Hyderabad";



    public Book() {
    }

    public Book(int bookId, String bookName, String bookAuthor) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.isAvailable=true;
    }



    public int getBookId() {
        return bookId;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public abstract void borrowBook(Book book) throws InvalidBookIdException;
    public abstract void returnBook();
    public abstract void displayInfo();



}
