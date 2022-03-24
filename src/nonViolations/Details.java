package nonViolations;

public class Details extends BookDetails implements InvoiceDetails
{
//    public void printBookData(Book book)
//    {
//        System.out.println("Name: " + book.bookName + " " + "Price: " + book.bookPrice + " " + "Mfg Year: " + book.publishYear+" "+"Author name: "+book.authorName);
//    }

    @Override
    public void printInvoice(Invoice invoice)
    {
        System.out.println(invoice.getQuantity() + "x " + invoice.getBook().bookName + " " + invoice.getBook().bookPrice + " $");
        System.out.println("Discount Rate: " + invoice.getDiscountRate());
        System.out.println("Tax Rate: " + invoice.getTaxRate());
        System.out.println("Total: " + invoice.getTotal() + " $");
    }
}
