package controller;

import abstractdata.ADataListPane;
import api.API;
import caculatingmethod.FirstCalculatingMethod;
import entity.Bike;
import entity.Order;
import view.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ReturnBikeController {
    private ReturnBikeListPane listPane;
    private List<ReturnBikeSinglePane> listSinglePane;
    private API api = new API();
    private JPanel mainPanel;
    private StationController controller;
    private int returnStationID;

    public ReturnBikeController() {
        controller = new StationController() {
            @Override
            public ADataListPane createListStationPane() {
                return new ReturnListStationPane(controller);
            }

            @Override
            public void doOnButtonClicked(String id) {
                returnStationID = Integer.parseInt(id);
            }
        };

        listSinglePane = new ArrayList<ReturnBikeSinglePane>();
        listPane = new ReturnBikeListPane();
        listPane.setController(this);
        listPane.updateData(api.getListOrder());

        new Thread(() -> {
            while (true)
            {
                try {
                    Thread.sleep(1000);
                    for (ReturnBikeSinglePane singlePane : listSinglePane) {
                        singlePane.updateData(singlePane.getOrder());
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public ReturnBikeSinglePane createSinglePane(Order order) {
        ReturnBikeSinglePane returnBikeSinglePane = new ReturnBikeSinglePane(order, getBike(), new FirstCalculatingMethod());
        
        listSinglePane.add(returnBikeSinglePane);
        return returnBikeSinglePane;
    }
    public void returnBike(int bikeID) {
        api.returnBike(returnStationID, bikeID);
    }

    public Bike getBike() {
        return api.getBike();
    }

    public JPanel getReturnBikePage() {

        return new ReturnBikePane(controller.getDataPagePane(), listPane);
    }

//    public JScrollPane getListPane() {
//        return listPane;
//    }
//
//    public JPanel getDataPagePane() {
//        StationPageController controller = new StationPageController();
//
//        return controller.getDataPagePane();
//    }
}
