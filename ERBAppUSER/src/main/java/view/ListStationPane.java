package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import abstractdata.ADataListPane;
import abstractdata.ADataSinglePane;
import controller.StationPageController;
import entity.*;

public class ListStationPane<T> extends ADataListPane<T> {
	private StationPageController controller;
//	public ListStationPane(){
//		super();
//	}
	public ListStationPane(StationPageController controller){
		setController(controller);
	}
	public void decorateCell(ADataSinglePane<T> singlePane) {
		JButton button = new JButton("Xem chi tiet");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String stationId = ((StationGeneral)singlePane.getData()).getID();
				controller.getStationInfoPage(stationId);
			}
		});
		singlePane.addDataHandlingComponent(button);		
	}

	public void setController(StationPageController controller) {
		super.setController(controller);
		this.controller = controller;
	}
}
