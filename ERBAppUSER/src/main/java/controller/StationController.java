package controller;

import abstractdata.*;
import entity.StationGeneral;
import main.EBRUserController;
import view.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class StationController {
    private ADataPagePane pagePane;
    protected EBRUserController ebrController;
    public StationController() {
        this.ebrController=null;
    }
    public StationController(EBRUserController controller) {
        this.ebrController= controller;
    }
    public JPanel getDataPagePane() {
        ADataSearchPane ADataSearchPane = createStationSearchPane();

        ADataListPane listPane = createListStationPane();
//        listPane.setController(this);

        ADataSearchPane.setController(new ISearchPaneController() {
            @Override
            public void search(Map<String, String> searchParams) {
                List<?> list = StationController.this.search(searchParams);
                listPane.updateData(list);
            }
        });

        ADataSearchPane.fireSearchEvent();

        return new ADataPagePane(ADataSearchPane, listPane);
    }

    public abstract ADataListPane createListStationPane();
    public abstract void doOnButtonClicked(String id);

    public ADataSearchPane createStationSearchPane() {
        return new StationSearchPane();
    }
    public ADataSinglePane createCellInfoPane() {
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
        return list;
    }


}
