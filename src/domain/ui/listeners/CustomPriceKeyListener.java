package domain.ui.listeners;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;

import domain.controllers.PosSaleController;
import domain.ui.PosUiBuilder;
import domain.ui.utils.PosUiConstants;
import domain.ui.utils.PosUiProductType;

public class CustomPriceKeyListener extends KeyAdapter {

	private JTextField customPrice;

	public CustomPriceKeyListener (JTextField customPrice) {
		this.customPrice = customPrice;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		GlobalHotKeys.keyReleased(e);
		switch (e.getKeyCode()) {
			case KeyEvent.VK_ADD:
				PosSaleController.getInstance().addItemCustomPrice(PosUiProductType.CERVEZA.getReceiptValue(), customPrice.getText().replace(""+PosUiConstants.ADD_KEY, PosUiConstants.EMPTY));
				customPrice.setText(PosUiConstants.EMPTY);
				PosUiBuilder.updateSaleUiInfo();
				break;
		}
	}
}
