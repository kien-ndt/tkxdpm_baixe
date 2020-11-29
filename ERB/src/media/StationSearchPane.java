package media;

import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class StationSearchPane extends SearchPane{
	private JTextField nameField;
	private JTextField addressField;
	
	public StationSearchPane() {
		super();
	}
	
	public void buildControls() {
		JLabel name = new JLabel("Station Name");
		nameField = new JTextField(30);
		int row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		add(name, c);
		c.gridx = 1;
		c.gridy = row;
		add(nameField, c);
		
		JLabel addressLabel = new JLabel("Station Address");
		addressField = new JTextField(30);
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		add(addressLabel, c);
		c.gridx = 1;
		c.gridy = row;
		add(addressField, c);
	}
	
	@Override
	public Map<String, String> getQueryParams() {
		Map<String, String> res = super.getQueryParams();
		
		if (!nameField.getText().trim().equals("")) {
			res.put("name", nameField.getText().trim());
		}
		if (!addressField.getText().trim().equals("")) {
			res.put("address", addressField.getText().trim());
		}
		return res;
	}
	
}
