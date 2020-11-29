package main;

import javax.swing.JPanel;

import media.*;

public class EBRUserController {
	public JPanel getStationPage() {
		StationPageController controller = new StationPageController();
		return controller.getDataPagePane();
	}
}
