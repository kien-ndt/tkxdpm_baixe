package media;

import java.awt.Dimension;
import java.awt.LayoutManager;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public abstract class ListDataPane<T> extends JScrollPane{
	private LayoutManager layout;
	protected JPanel pane;
	
	protected StationPageController controller = new StationPageController();

	public ListDataPane() {
		pane = new JPanel();
		layout = new BoxLayout(pane, BoxLayout.Y_AXIS);
		pane.setLayout(layout);
		
		this.setViewportView(pane);
		this.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		this.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.getVerticalScrollBar().setUnitIncrement(20);
		this.getHorizontalScrollBar().setUnitIncrement(20);
	}
	
	public abstract void decorateCell(BikeStationCell<T> singlePane);

	public void updateData(List<? extends T> list) {
		pane.removeAll();
		pane.revalidate();
		pane.repaint();
		for (T t: list) {
			System.out.println("sadasdad");
			BikeStationCell<T> singlePane = controller.createCellInfoPane();
			decorateCell(singlePane);

            singlePane.updateData(t);
            pane.add(singlePane);
            pane.add(Box.createRigidArea(new Dimension(0, 40)));
        }
	}
	
	public void setController(StationPageController controller) {
		this.controller = controller;
	}
}
