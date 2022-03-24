package nonViolations;

public class StorageInvoice
{
    private SaveInvoice saveInvoice;
   public StorageInvoice(SaveInvoice saveInvoice)
   {
       this.saveInvoice=saveInvoice;
   }
    public void showSaveFiles()
    {
        saveInvoice.saveDetails();
    }
}
