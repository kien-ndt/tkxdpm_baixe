package media;

import javax.swing.JButton;

public class HomeNavArea extends NavArea{
	public HomeNavArea() {
		super();
		setNavAreaLabel("Danh sách bãi xe ");
		JButton thuexe = new JButton("Thuê xe");
		JButton xemxe = new JButton("Xem xe đang thuê");
		this.add(thuexe);
		this.add(xemxe);
	}
}
