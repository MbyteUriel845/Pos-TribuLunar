package domain.ui.utils;

public enum PosUiProductType {


	CERVEZA ("Cerveza","Cerveza");

	private String uiValue;
	private String receiptValue;

	private PosUiProductType (String uiValue, String receiptValue) {
		this.uiValue = uiValue;
		this.receiptValue = receiptValue;
	}

	public String getUiValue () {
		return uiValue;
	}

	public String getReceiptValue () {
		return receiptValue;
	}

}
