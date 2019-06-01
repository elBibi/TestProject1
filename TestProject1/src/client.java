
public class client 
{
	public static void main(String[] args)
	{
		InvoiceService invoices = CrudeContainer.getInvoiceService();
		
		Invoice newInvoice = new Invoice("11080", "Bill McLarane");
		
		invoices.raiseInvoice(newInvoice);
		invoices.updateInvoice(newInvoice);
	}
}
