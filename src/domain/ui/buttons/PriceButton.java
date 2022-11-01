package domain.ui.buttons;

import javax.swing.JButton;

import domain.ui.utils.PosUiPriceType;

@SuppressWarnings("serial")
public class PriceButton extends JButton {

	private PosUiPriceType priceType;

	public PriceButton(PosUiPriceType priceType) {
		super(priceType.getUiValue());
		this.priceType = priceType;
	}

	public PosUiPriceType getPriceType () {
		return priceType;
	}
}
