package rentBike;

import api.MediaApi;
import payment.BankDialog;

public class RentBikeController {

    private QRCodeDialog dialog;
    private RentBikeDialog rentBikeDialog;
    private BankDialog bankDialog;

    public RentBikeController() {
        dialog = new QRCodeDialog();
        rentBikeDialog = new RentBikeDialog();
        bankDialog = new BankDialog();
    }

    public void showBarcodeDialog() {
        dialog.setVisible(true);
    }

    public void shutDownQRCodePane(QRCodeDialog pane) {
        pane.setVisible(false);
    }

    public void showRentBikePane(RentBikeEntity rentBikeEntity) {

        rentBikeDialog.getIdBikeField().setText(rentBikeEntity.getId() + "");
        rentBikeDialog.getTypeBikeField().setText(rentBikeEntity.getType());
        rentBikeDialog.getDepositBikeField().setText(rentBikeEntity.getDeposit());
        rentBikeDialog.getRentBikeParkID().setText(rentBikeEntity.getIdStation()+"");

        rentBikeDialog.setVisible(true);
    }

    public void showBankDialog() {
        bankDialog.setVisible(true);
    }

    public RentBikeEntity getRentBikeEntity(String idBike) {
        RentBikeEntity rentBikeEntity = new MediaApi().getRentBike(idBike);
        return rentBikeEntity;
    }
}
