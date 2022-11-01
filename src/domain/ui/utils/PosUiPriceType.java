package domain.ui.utils;

public enum PosUiPriceType {

	CENTS_35 (" 1 Cerveza $ 35.00",35.00f),
    CENTS_90 (" 1 Ginebra $ 90.00",90.00f),
	CENTS_80 (" 1 Wisky   $ 80.00",80.00f),
    CENTS_25 (" 1 Agua    $ 25.00",25.00f);

	private String uiValue;
	private float priceValue;

	private PosUiPriceType (String uiValue, float priceValue) {
		this.uiValue = uiValue;
		this.priceValue = priceValue;
	}

	public String getUiValue () {
		return uiValue;
	}

	public float getPriceValue () {
		return priceValue;
	}

}
