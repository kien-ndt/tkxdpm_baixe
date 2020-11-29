package media;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JPanel;

//import com.oms.bean.Media;

import entity.*;
import main.EBRUserController;
import abstractdata.ADataPagePane;
//import api.MediaApi;
import abstractdata.ISearchPaneController;

public class StationPageController {
	private ADataPagePane pagePane;
	private EBRUserController ebrController;
	public StationPageController() {
		this.ebrController=null;
	}
	public StationPageController(EBRUserController controller) {
		this.ebrController= controller;
	}
	public JPanel getDataPagePane() {
		SearchPane searchPane = createStationSearchPane();

		ListDataPane listPane = createListStationPane();
		listPane.setController(this);
		
		searchPane.setController(new ISearchPaneController() {
			@Override
			public void search(Map<String, String> searchParams) {
				List<?> list = StationPageController.this.search(searchParams);
				listPane.updateData(list);
			}
		});
				
		searchPane.fireSearchEvent();
		
		return new ADataPagePane(searchPane, listPane);
	}
	
	public ListDataPane createListStationPane() {
		return new ListStationPane();
	}
	public SearchPane createStationSearchPane() {
		return new StationSearchPane();
	}
	public BikeStationCell createCellInfoPane() {
		return new StationCell();
	}	
	
	public List<?> search(Map<String, String> searchParams) {
//		return new MediaApi().getBooks(searchParams);
		List<StationGeneral> list = new ArrayList<StationGeneral>();
		StationGeneral s1 = new StationGeneral();
		s1.id="1";
		s1.stationName="sân 1";
		s1.stationAddress="hai ba trung";
		s1.num_Vehicies=40;
		s1.num_Docks=2;
		list.add(s1);
		s1.id="1";
		s1.stationName="sân 1";
		s1.stationAddress="hai ba trung";
		s1.num_Vehicies=40;
		s1.num_Docks=2;
		list.add(s1);
//		System.out.println(s1);
		return list;
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
		ebrController.setInfoPane(infoPane);		
	}
}
