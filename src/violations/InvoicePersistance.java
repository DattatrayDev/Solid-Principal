package violations;

public class InvoicePersistance
{
    Invoice invoice;

    public InvoicePersistance(Invoice invoice)
    {
        this.invoice = invoice;
    }
    public void saveToDatabase()
    {
        System.out.println("Saving in Database....");
    }
    public void saveToFile()
    {
        System.out.println("Saving in File....");
    }
}
