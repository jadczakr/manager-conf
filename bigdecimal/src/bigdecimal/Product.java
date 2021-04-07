package bigdecimal;


public class Product {

	private String name;
	private VatValue vatValue;
	
	public Product() {};
	
	public Product(String name, VatValue vatValue, double price)
	{
		this.name = name;
		this.vatValue = vatValue;
	}
	
	
	public boolean requiresManagerConfirmationBeforeSelling(){
		
		return this.vatValue != VatValue.VAT_23;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VatValue getVatValue() {
		return vatValue;
	}

	public void setVatValue(VatValue vatValue) {
		this.vatValue = vatValue;
	}
	
	
}
