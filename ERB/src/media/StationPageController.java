package media;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JPanel;

//import com.oms.bean.Media;

import entity.*;
import abstractdata.ADataPagePane;
//import api.MediaApi;
import abstractdata.ISearchPaneController;

public class StationPageController {
	private ADataPagePane pagePane;
	
	public JPanel getDataPagePane() {
		SearchPane searchPane = createStationSearchPane();
		
		ListDataPane listPane = createListStationPane();
		
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
	
	
	
	public static List<?> search(Map<String, String> searchParams) {
//		return new MediaApi().getBooks(searchParams);
		List<StationGeneral> list = new ArrayList<StationGeneral>();
		StationGeneral s1 = new StationGeneral();
		s1.id="1";
		s1.stationName="sân 1";
		s1.stationAddress="hai ba trung";
		s1.num_Vehicies=4;
		s1.num_Docks=2;
		list.add(s1);
//		System.out.println(s1);
		return list;
	}
	public static List<?> search1() {
//		return new MediaApi().getBooks(searchParams);
		List<StationGeneral> list = new ArrayList<StationGeneral>();
		StationGeneral s1 = new StationGeneral();
		s1.id="1";
		s1.stationName="sân 1";
		s1.stationAddress="hai ba trung";
		s1.num_Vehicies=4;
		s1.num_Docks=2;
		list.add(s1);
		s1.id="1";
		s1.stationName="sân 1";
		s1.stationAddress="hai ba trung";
		s1.num_Vehicies=4;
		s1.num_Docks=2;
		list.add(s1);
		s1.id="1";
		s1.stationName="sân 1";
		s1.stationAddress="hai ba trung";
		s1.num_Vehicies=4;
		s1.num_Docks=2;
		list.add(s1);
//		System.out.println(s1);
		return list;
	}
}
