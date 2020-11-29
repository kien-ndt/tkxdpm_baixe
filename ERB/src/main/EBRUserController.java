package main;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import media.*;

public class EBRUserController {
	private JPanel rootPanel;
	public JPanel getStationPage() {
		StationPageController controller = new StationPageController(this);
		return controller.getDataPagePane();
	}
	
	public void setPanel(JPanel rootPanel) {
		this.rootPanel = rootPanel;
	}
	
	public void setInfoPane(InfoPane pane) {
		rootPanel.removeAll();
		rootPanel.revalidate();
		BorderLayout layout = new BorderLayout();
		rootPanel.setLayout(layout);
		
		
		
		
		rootPanel.add(pane, BorderLayout.CENTER);
	}
}
