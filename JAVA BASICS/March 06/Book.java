public class Book 
{
    String title;
    String Author;
    double price;

    Book (String title, String Author, double price)
    {
        this.title = title;
        this.Author = Author;
        this.price = price;
    }
    Book(Book other)
    {
        this.title = other.title;
        this.Author = other.Author;
        this.price = other.price;
    }
    void displayDetails()
    {
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ Author);
        System.out.println("Price: "+ price);
    }
    public static void main(String[] args) {
        Book originalBook = new Book("Java Programming", "James Gosling", 30.5);
        System.out.println("Original Book details: ");
        originalBook.displayDetails();

        Book copiedBook = new Book(originalBook);
        System.out.println("copied book details ");
        copiedBook.displayDetails();
    }
}
