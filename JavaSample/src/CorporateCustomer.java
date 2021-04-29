
public class CorporateCustomer extends Customer {
	private String companyName;
	
	public CorporateCustomer(int id) {
		super(id);
	}
	
	public CorporateCustomer(int id,String companyName) {
		super(id);
		this.companyName=companyName;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		
	}
}
