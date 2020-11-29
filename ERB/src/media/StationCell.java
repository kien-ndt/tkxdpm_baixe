package media;

import javax.swing.JLabel;
import entity.StationGeneral;

public class StationCell extends BikeStationCell{
	private JLabel labelBarcode;
	private JLabel labelDescription;
	private JLabel labelQuantity;
	private JLabel labelWeight;
	private JLabel labelDimension;
	public StationCell() {
		super();
	}
	public StationCell(StationGeneral station) {
		super();
		this.t=station;
		displayData();
	}
	public void buildControls() {
		super.buildControls();
		int row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelBarcode = new JLabel();
		add(labelBarcode, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelDescription = new JLabel();
		add(labelDescription, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelQuantity = new JLabel();
		add(labelQuantity, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelWeight = new JLabel();
		add(labelWeight, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelDimension = new JLabel();
		add(labelDimension, c);
	}
	public void displayData() {
		if (t instanceof StationGeneral) {
		StationGeneral station = (StationGeneral) t;
		labelBarcode.setText("Barcode: " + station.id);
		labelDescription.setText("Description: " + station.stationName);
		labelQuantity.setText("Quantity: " + station.stationAddress);
		labelWeight.setText("Weight: " + station.num_Docks);
		labelDimension.setText("Dimension: " + station.num_Vehicies);
		}
	}
}
