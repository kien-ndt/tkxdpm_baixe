package abstractdata;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
@SuppressWarnings("serial")
public abstract class ADataSinglePane<T> extends JPanel{
	protected GridBagLayout layout;
	protected GridBagConstraints c;
	protected T t;
	private JPanel panel;
	public ADataSinglePane() {
		buildControls();
	}
	
	protected int getLastRowIndex() {
		layout.layoutContainer(this);
		int[][] dim = layout.getLayoutDimensions();
	    int rows = dim[1].length;
	    return rows;
	}
	public void buildControls() {
		layout = new GridBagLayout();
		this.setLayout(layout);
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1;		
	};
	public abstract void displayData();
	
	public void updateData(T t) {
		this.t = t;
		displayData();
	}
	
	public void addDataHandlingComponent(Component component) {
		if (panel == null) {
			int row = getLastRowIndex();
			c.gridx = 0;
			c.gridy = row;
			panel = new JPanel();
			this.add(panel, c);
			panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		}
		
		panel.add(component);
	}
	
	public T getData(){
		return t;
	}
}
