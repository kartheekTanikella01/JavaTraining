package exceptionHandling.MIniProject;

import exceptionHandling.MIniProject.CustomException.InvalidBookIdException;
import exceptionHandling.MIniProject.books.Book;
import exceptionHandling.MIniProject.books.FictionBooks;
import exceptionHandling.MIniProject.users.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        User user =new User();
        user.setId(scanner.nextInt());
        user.setName(scanner.next());
        user.addUser(user);
        List<Book> bookList=new ArrayList<>();

        Book book1=new FictionBooks(101,"the book1","kartheek");
        Book book2 = new FictionBooks(102,"the book2","sharath");
        Book book3=new FictionBooks(103,"thebook3","venkat");
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        int input = scanner.nextInt();

        Optional<Book> result = bookList.stream()
                .filter(b -> b.getBookId() == input)
                .findFirst();

        if (result.isPresent()) {
            try {
                Book book = result.get();
                book.borrowBook(book); // This will check availability & may throw exception
            } catch (InvalidBookIdException e) {
                System.out.println("Book unavailable: " + e.getMessage());
            }
        }




    }
}
