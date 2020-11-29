package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

import media.HomeNavArea;

@SuppressWarnings("serial")
public class EBRUser extends JFrame{
	public static final int WINDOW_WIDTH = 800;
	public static final int WINDOW_HEIGHT = 550;
	JPanel rootPanel = new JPanel();
	JLabel label = new JLabel();
	
	public EBRUser(EBRUserController controller) {
		setContentPane(rootPanel);		
		
		UBRUserCreateHome(controller);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Bike User");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setVisible(true);
	}

	public void UBRUserCreateHome(EBRUserController controller) {
		BorderLayout layout = new BorderLayout();
		rootPanel.setLayout(layout);
		controller.setPanel(rootPanel);		       

		rootPanel.add(new HomeNavArea(), BorderLayout.NORTH);
		JPanel stationPage = controller.getStationPage();		
		rootPanel.add(stationPage, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new EBRUser(new EBRUserController());
			}
		});
	}
}
