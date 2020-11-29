package media;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import entity.*;

public class ListStationPane<T> extends ListDataPane<T>{
	public ListStationPane(){
		super();
	}
	public void decorateCell(BikeStationCell<T> singlePane) {		
		JButton button = new JButton("Xem chi tiet");
		singlePane.addDataHandlingComponent(button);		
	}
	
}
