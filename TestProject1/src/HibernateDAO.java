
public class HibernateDAO implements InvoicingDAO {

	@Override
	public void save(Invoice newInvoice) {
		// TODO Auto-generated method stub
		System.out.println("Save     from HibernateDAO");

	}

	@Override
	public void delete(Invoice oldInvoice) {
		// TODO Auto-generated method stub
		System.out.println("delete     from HibernateDAO");

	}

	@Override
	public void update(Invoice invoiceToCancel) {
		// TODO Auto-generated method stub
		System.out.println("update     from HibernateDAO");
	}

}
