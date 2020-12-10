package abstractdata;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import abstractdata.*;
public abstract class ADataSearchPane extends JPanel{
	private ISearchPaneController controller;
	
	protected GridBagLayout layout;
	protected GridBagConstraints c;
	
	public ADataSearchPane() {
		layout = new GridBagLayout();
		this.setLayout(layout);		
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		buildControls();
		int row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		JButton searchButton = new JButton("Search");
		searchButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.search(getQueryParams());
			}
		});
		add(searchButton, c);
		// Empty label for resizing
		c.weightx = 1;
		c.gridx = 2;
		c.gridy = row - 1;
		add(new JLabel(), c);
	}	
	
	public abstract void buildControls();
	
	protected int getLastRowIndex() {
		layout.layoutContainer(this);
		int[][] dim = layout.getLayoutDimensions();
	    int rows = dim[1].length;
	    return rows;
	}
	
	public ADataSearchPane(ISearchPaneController controller) {
		this();
		this.controller = controller;
	}
	
	public Map<String, String> getQueryParams() {
		Map<String, String> res = new HashMap<String, String>();
		return res;
	}	
	
	public void setController(ISearchPaneController controller) {
		this.controller = controller;
		System.out.println("Controller da dc gan");
	}	
	
	public void fireSearchEvent() {
		controller.search(getQueryParams());
	}
}
