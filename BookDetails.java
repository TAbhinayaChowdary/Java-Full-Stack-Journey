import java.util.*;

class Books
{
    int bookID;
    String bookName;
    String authorName;
    double price;

    public Books(int bookID, String bookName, String authorName, double price)
    {
        this.bookID = bookID;
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }

    public void showDetails()
    {
        System.out.println("Book ID: "+bookID+"\nBook Name: "+bookName+"\nAuthor Name: "+authorName+"\nPrice: "+price+"\n\n");
    }
}
class BookDetails
{
    public static void main(String args[])
    {
        Books[] books = new Books[3];
        
        books[0] = new Books(101, "One Indian Girl", "Chethan Bhagat", 200);
        books[1] = new Books(102, "One Night Call Center", "Chethan Bhagat", 175);
        books[2] = new Books(201, "She stood by me", "Tharun", 250);

        for(Books book: books)
        {
            book.showDetails();
        }
    }
}
