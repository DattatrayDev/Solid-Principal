package nonViolations;

public class BookDetails
{
    public void printBookData(Book book)
    {
        System.out.println("Name: " + book.bookName + " " + "Price: " + book.bookPrice + " " + "Mfg Year: " + book.publishYear+" "+"Author name: "+book.authorName);
    }
}