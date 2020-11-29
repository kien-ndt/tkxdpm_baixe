package media;

import javax.swing.JLabel;

import entity.Station;
import entity.StationGeneral;

public class StationInfoPane extends InfoPane{
	private JLabel name;
	private JLabel address;
	private JLabel id;
	private JLabel ebike;
	private JLabel bike;
	private JLabel tbike;
	private JLabel emptyDocks;
	private JLabel title;
	public StationInfoPane(){
		super();
	}	
	
	protected void buildControls() {
		int r = getLastRowIndex();
		addTitle("Station ID: ", 0, r);
		id = new JLabel();
		c.gridx=1;
		c.gridy=r;
		add(id,c);		
		
		addTitle("Number of Bikes: ", 2, r);
		bike = new JLabel();
		c.gridx=3;
		c.gridy=r;
		add(bike,c);
		
		r = getLastRowIndex();
		addTitle("Station name: ", 0, r);
		name = new JLabel();
		c.gridx=1;
		c.gridy=r;
		add(name,c);		
		
		addTitle("Number of EBikes: ", 2, r);
		ebike = new JLabel();
		c.gridx=3;
		c.gridy=r;
		add(ebike,c);
		
		r = getLastRowIndex();
		addTitle("Station address: ", 0, r);
		address = new JLabel();
		c.gridx=1;
		c.gridy=r;
		add(address,c);		
		
		addTitle("Number of Twin Bike: ", 2, r);
		tbike = new JLabel();
		c.gridx=3;
		c.gridy=r;
		add(tbike,c);
		
	}
	
	protected void displayData() {
		if (t instanceof Station) {
			Station station = (Station)t;
			id.setText(station.stationID);
			name.setText(station.stationName);
			address.setText(station.stationAddress);
			bike.setText(Integer.toString(station.c_Bike));
			ebike.setText(Integer.toString(station.c_EBike));
			tbike.setText(Integer.toString(station.c_TBike));			
		}
		
	}
	
	private void addTitle(String tit, int x, int y) {
		title = new JLabel(tit);
		c.gridx = x;
		c.gridy = y;
		add(title,c);
	}
}
