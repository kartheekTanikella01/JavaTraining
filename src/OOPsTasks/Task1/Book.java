package OOPsTasks.Task1;

public class Book {
    public  String title;
    public String author;
    public int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String displayDetails(){
        return title +" "+author+" "+price;
    }

    public static void main(String[] args) {
        Book b1=new Book("Java","Kartheek",9999);
        Book b2=new Book("python","ran",9999);

        System.out.println(b1.displayDetails());
        System.out.println(b2.displayDetails());

    }
}