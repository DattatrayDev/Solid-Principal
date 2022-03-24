package nonViolations;

public class BookUI
{
    public static void main(String[] args) {
        Book book=new Book("Wings Of Fire", 1999, 150, "APJ Abdul Kalam");

        Invoice invoice=new Invoice(book, 2, 5.0, 2.0);

//        Details details=new BookDetails();
//        details.printBookData(book);
//        details.printInvoice(invoice);

       //SaveInvoice saveInvoice=new DatabasePersistence();

        SaveInvoice saveInvoice=new FilePersistence();

        StorageInvoice storageInvoice=new StorageInvoice(saveInvoice);
        storageInvoice.showSaveFiles();
    }
}
