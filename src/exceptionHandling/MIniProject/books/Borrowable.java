package exceptionHandling.MIniProject.books;

public interface Borrowable {
    default void  returnPolicy(){
        System.out.println("book should be returned n 30 days... ");
    }

}
