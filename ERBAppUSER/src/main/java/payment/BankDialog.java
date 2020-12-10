package payment;

import rentBike.RentBikeController;

import javax.swing.*;
import java.awt.*;

public class BankDialog extends JDialog {
    private GridBagLayout layout;
    private GridBagConstraints c;

    private JTextField numberAccount,nameOwnerAccount,nameBank;
    private JButton closeButton;
    private JButton rentButton;
    private RentBikeController controller;

    private BankDialog mySelf;

    public BankDialog() {
        layout = new GridBagLayout();
        this.setLayout(layout);
        c = new GridBagConstraints();
        addControl();
      //  addEvent();
    }

//    private void addEvent() {
//        closeButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                controller= new RentBikeController();
//                controller.shutDownBarcodePane(mySelf);
//            }
//        });

//        rentButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                controller = new RentBikeController();
//                controller.showDetailBikePane(idBikeField);
//            }
//        });
 //   }

    private void addControl() {

        mySelf = this;
        this.setTitle("Thanh toán");
        this.getContentPane().removeAll();
        c.insets = new Insets(10, 0, 5, 0);
        c.gridx = 0;
        c.gridy = 0;
        add(new JLabel("Nhập số TK "), c);
        c.gridx = 1;
        c.gridy = 0;
        numberAccount = new JTextField(15);
        add(numberAccount, c);

        c.insets = new Insets(10, 0, 5, 0);
        c.gridx = 0;
        c.gridy = 1;
        add(new JLabel("Chủ tài khoản"), c);
        c.gridx = 1;
        c.gridy = 1;
        nameOwnerAccount = new JTextField(15);
        add(nameOwnerAccount, c);

        c.insets = new Insets(10, 0, 5, 0);
        c.gridx = 0;
        c.gridy = 2;
        add(new JLabel("Tên ngân hàng"), c);
        c.gridx = 1;
        c.gridy = 2;
        nameBank = new JTextField(15);
        add(nameBank, c);

        c.insets = new Insets(0, 0, 5, 0);
        c.gridx = 0;
        c.gridy = 3;
        closeButton = new JButton("Thoát");
        add(closeButton, c);
        c.gridx = 1;
        c.gridy = 3;
        rentButton = new JButton("Thuê");
        add(rentButton, c);

        this.revalidate();
        this.repaint();
        this.pack();
        this.setResizable(false);
    }
}
