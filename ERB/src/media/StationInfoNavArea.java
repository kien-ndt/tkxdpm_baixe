package media;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import main.EBRUserController;

public class StationInfoNavArea extends HomeNavArea{
	JButton backButton = new JButton("Trở về");
	public StationInfoNavArea() {
		this.add(backButton);
	}
	public StationInfoNavArea(EBRUserController ebrController) {
		this();
		backButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ebrController.backHomePage();
			}
		});
	}
	
}
