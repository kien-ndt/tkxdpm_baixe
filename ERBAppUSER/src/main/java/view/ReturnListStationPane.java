package view;

import abstractdata.ADataListPane;
import abstractdata.ADataSinglePane;
import controller.StationController;
import entity.StationGeneral;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReturnListStationPane extends ADataListPane {

    public ReturnListStationPane(StationController controller){
        super.setController(controller);
    }

    @Override
    public void decorateCell(ADataSinglePane singlePane) {
        JButton button = new JButton("Chọn bãi xe này");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String stationId = ((StationGeneral)singlePane.getData()).getID();
                controller.doOnButtonClicked(stationId);
            }
        });
        singlePane.addDataHandlingComponent(button);
    }
}
