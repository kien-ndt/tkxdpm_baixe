package main;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import abstractdata.DataPagePane;
import media.*;

public class EBRUserController {
	private EBRUser ebr;
	private JPanel rootPanel;
	public JPanel getStationPage() {
		StationPageController controller = new StationPageController(this);
		return controller.getDataPagePane();
	}
	
	public void setEBRUser(EBRUser ebr) {
		this.ebr = ebr;
	}
	public void setInfoPane(DataPagePane pane) {
		rootPanel = ebr.rootPanel;
		rootPanel.removeAll();
		rootPanel.revalidate();
		BorderLayout layout = new BorderLayout();
		rootPanel.setLayout(layout);
		
		StationInfoNavArea navArea = new StationInfoNavArea(this);		
		
		rootPanel.add(navArea, BorderLayout.NORTH);		
		
		rootPanel.add(pane, BorderLayout.CENTER);
	}
	
	public void backHomePage() {
		rootPanel.removeAll();
		rootPanel.revalidate();
		ebr.UBRUserCreateHome(this);
	}
}
