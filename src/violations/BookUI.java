package violations;

public class BookUI
{

    public static void main(String[] args)
    {

        Book book=new Book("Wings Of Fire", 1999,200,"APJ Abdul Kalam");

        Invoice invoice=new Invoice(book, 2, 5.0, 2.0);


        invoice.printBookData(book);
        invoice.calculateTotal();
        invoice.printInvoice();


        InvoicePersistance invoicePersistence=new InvoicePersistance(invoice);
        invoicePersistence.saveToDatabase();
        invoicePersistence.saveToFile();

    }
}
