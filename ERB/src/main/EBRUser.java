package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class EBRUser extends JFrame{
	public static final int WINDOW_WIDTH = 800;
	public static final int WINDOW_HEIGHT = 550;
	
	public EBRUser(EBRUserController controller) {
		JPanel rootPanel = new JPanel();
		setContentPane(rootPanel);
		BorderLayout layout = new BorderLayout();
		rootPanel.setLayout(layout);
		
		JPanel navArea = new JPanel();
		navArea.setLayout(new BoxLayout(navArea, BoxLayout.X_AXIS));
		rootPanel.add(navArea, BorderLayout.NORTH);
		navArea.add(Box.createVerticalGlue());
		JLabel label = new JLabel();
		navArea.add(label);
		label.setText("Station List");
		
        JPanel twoButton = new JPanel();
        twoButton.setAlignmentX(Component.RIGHT_ALIGNMENT);
        twoButton.setLayout(new BoxLayout(twoButton, BoxLayout.X_AXIS));
 
        JButton ok = new JButton("Thuê xe");
       
        JButton close = new JButton("Xe đang thuê");
 
        twoButton.add(ok);
        twoButton.add(close);
//        twoButton.add(Box.createRigidArea(new Dimension(15, 0)));
		navArea.add(twoButton);        
		
		JPanel stationPage = controller.getStationPage();
		
		stationPage.setBackground(Color.gray);
		rootPanel.add(stationPage, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Bike User");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setVisible(true);
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
