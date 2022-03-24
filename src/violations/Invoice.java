package violations;

public class Invoice extends BookDetails implements Printer
{
    private Book book;
    private int quantity;
    private double discountRate;
    private double taxRate;
    private double total;

    public Invoice(Book book, int quantity, double discountRate, double taxRate) {
        this.book = book;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
        this.total = this.calculateTotal();
    }

    public double calculateTotal() {
        double price = ((book.bookPrice - (book.bookPrice * (discountRate/100))) * this.quantity);

        double total = price * (1 + (taxRate/100));

        return total;
    }

    @Override
    public void printInvoice()
    {
        System.out.println(quantity + "x " + book.bookName + " " +book.bookPrice + "$");
        System.out.println("Discount Rate: " + discountRate);
        System.out.println("Tax Rate: " + taxRate);
        System.out.println("Total:- " + total);
    }

    @Override
    public void bookInformation()
    {

    }
}
