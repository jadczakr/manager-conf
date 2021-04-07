package bigdecimal;

public enum VatValue {

	VAT_23(0.23),
	VAT_7(0.07),
	VAT_9(0.09);
	
	public final double vat;
	
	VatValue(double vat)
	{
		this.vat = vat;
	}
}
