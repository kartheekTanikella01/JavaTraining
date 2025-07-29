package exceptionHandling.MIniProject.books;

import exceptionHandling.MIniProject.CustomException.InvalidBookIdException;


public class FictionBooks extends Book implements Borrowable{
    public FictionBooks() {
    }

    public FictionBooks(int bookId, String bookName, String bookAuthor) {
        super(bookId, bookName, bookAuthor);
    }

    @Override
    public void borrowBook(Book book) throws InvalidBookIdException {
        if(book.getAvailable()){
            System.out.println(" Borrowed book title:  "+ getBookName() +" Author: "+ getBookAuthor());
        }else{
            throw new InvalidBookIdException("Exception caught: ");
        }


    }

    @Override
    public void returnBook() {
        System.out.println(" Returned book title:  "+ getBookName() +" Author: "+ getBookAuthor());
    }

    @Override
    public void displayInfo() {
        System.out.println("Title"+getBookName());

    }


    @Override
    public void returnPolicy() {
        Borrowable.super.returnPolicy();
    }
}
