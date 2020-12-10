package controller;

//import com.oms.bean.Media;

import abstractdata.ADataListPane;
import abstractdata.DataPagePane;
import entity.Station;
import main.EBRUserController;
import abstractdata.ADataPagePane;
//import api.MediaApi;
        import view.*;

import javax.swing.*;
import java.awt.*;

public class StationPageController extends StationController{
	private ADataPagePane pagePane;
	public StationPageController() {
		super();
	}
	public StationPageController(EBRUserController controller) {
		super(controller);
	}

	
	public ADataListPane createListStationPane() {
		return new ListStationPane(this);
	}

	@Override
	public void doOnButtonClicked(String id) {
		getStationInfoPage(id);
	}

	public void getStationInfoPage(String id) {
//		Station station = new MediaApi().getStation(id);

		System.out.println(id);
		Station station = new Station();
		station.stationID = "4";
		station.c_Bike=2;
		station.c_EBike=3;
		station.stationAddress="bach khoa";
		station.stationName= "bach";
		station.c_emptyDocks=0;
		station.c_TBike=6;
		StationInfoPane infoPane = new StationInfoPane();
		infoPane.updateData(station);

		JPanel bikepane = new JPanel(); // them pane chi tiet xe
		bikepane.setBackground(Color.GREEN);

		DataPagePane fullinfoPane = new DataPagePane(infoPane, bikepane);


		ebrController.setInfoPane(fullinfoPane);
	}

}
