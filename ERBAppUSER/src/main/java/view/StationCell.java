package view;

import javax.swing.JLabel;

import abstractdata.ADataSinglePane;
import entity.StationGeneral;

public class StationCell extends ADataSinglePane {
	private JLabel labelID;
	private JLabel labelStationName;
	private JLabel labelStationAddress;
	private JLabel labelNum_Docks;
	private JLabel labelNum_Vehicies;
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
		labelID = new JLabel();
		add(labelID, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelStationName = new JLabel();
		add(labelStationName, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelStationAddress = new JLabel();
		add(labelStationAddress, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelNum_Docks = new JLabel();
		add(labelNum_Docks, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		labelNum_Vehicies = new JLabel();
		add(labelNum_Vehicies, c);
	}
	public void displayData() {
		if (t instanceof StationGeneral) {
		StationGeneral station = (StationGeneral) t;
		labelID.setText("ID: " + station.getID());
		labelStationName.setText("Station Name: " + station.getStationName());
		labelStationAddress.setText("Station Address: " + station.getStationAddress());
		labelNum_Docks.setText("Number of Docks: " + station.getNum_Docks());
		labelNum_Vehicies.setText("Number of Vehicies: " + station.getNum_Vehicies());
		}
	}
}
