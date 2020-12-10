package nav;

import controller.ReturnBikeController;
import main.EBRUserController;
import nav.NavArea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeNavArea extends NavArea {
	JButton thuexe;
	EBRUserController controller;
	public HomeNavArea() {
		super();
		setNavAreaLabel("Danh sách bãi xe ");
		thuexe = new JButton("Thuê xe");
		JButton xemxe = new JButton("Xem xe đang thuê");
		this.add(thuexe);
		this.add(xemxe);
		controller = new EBRUserController();

		//ptn cđl Phạm Thành Nam bắt đầu ở đây ! - thuê xe
		thuexe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					controller.showQRCodeDialog();
			}
		});

		xemxe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JDialog dialog = new JDialog((Frame) null, "Xe đang thuê", true);


				ReturnBikeController controller = new ReturnBikeController();
				JPanel returnBikePane = controller.getReturnBikePage();

				//JPanel jPanel = new JPanel();

				BorderLayout layout = new BorderLayout();
				dialog.setLayout(layout);
				dialog.add(controller.getReturnBikePage(), BorderLayout.NORTH);

				//jPanel.setLayout(layout);
				//jPanel.add(returnBikePane, BorderLayout.NORTH);

//				GridBagLayout layout = new GridBagLayout();
//				GridBagConstraints c = new GridBagConstraints();
//				dialog.setLayout(layout);
//				c.fill = GridBagConstraints.CENTER;
//				c.weightx = 1;
//
//				int row = 0;
//				c.gridx = 0;
//				c.gridy = row;
//				dialog.add(controller.getListPane(), c);
//				dialog.add(controller.getDataPagePane(), c);

//				BoxLayout boxLayout = new BoxLayout(jPanel, BoxLayout.Y_AXIS);
//				jPanel.setLayout(boxLayout);
//				jPanel.add(returnBikePane);

//				SpringLayout layout = new SpringLayout();
//				jPanel.setLayout(layout);
//				jPanel.add(returnBikePane);
//				layout.putConstraint(SpringLayout.WEST, returnBikePane, 5, SpringLayout.WEST, jPanel);
//				layout.putConstraint(SpringLayout.NORTH, returnBikePane, 5, SpringLayout.NORTH, jPanel);
//				layout.putConstraint(SpringLayout.EAST, returnBikePane, -5, SpringLayout.EAST, jPanel);
//				layout.putConstraint(SpringLayout.SOUTH, returnBikePane, -5, SpringLayout.SOUTH, jPanel);

				//dialog.setContentPane(jPanel);

				dialog.pack();
				dialog.setResizable(false);
				dialog.setVisible(true);
//				this.revalidate();
//				this.repaint();
//				this.pack();
//				this.setResizable(false);
			}
		});
	}

}
