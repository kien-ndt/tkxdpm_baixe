package media;

import javax.swing.JButton;

import main.EBRUserController;

public class StationInfoNavArea extends HomeNavArea{
	JButton backButton = new JButton("Trở về");
	private EBRUserController ebr = new EBRUserController();
	public StationInfoNavArea() {
		this.add(backButton);
	}
	
}
