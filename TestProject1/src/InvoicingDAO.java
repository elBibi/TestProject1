/**
 * Defines the behaviour of any Invoicing Data    
 * Access Object in our system
 */
public interface InvoicingDAO 
{
   
   public void delete(Invoice oldInvoice);
   public void update(Invoice invoiceToCancel);
   public void save(Invoice newInvoice);

}
