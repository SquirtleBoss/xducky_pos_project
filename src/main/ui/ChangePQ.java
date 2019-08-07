//package main.ui;
//
//import main.model.pos.CarriedItems;
//import main.model.pos.Item;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class ChangePQ {
//    private JTextField textField2;
//    private JLabel label;
//    private JPanel pane;
//    private JButton setInformationButton;
//    private JButton deleteProductButton;
//    private JTextField textField1;
//    private JLabel label3;
//    private Item item;
//    private static CarriedItems items;
//
//    public ChangePQ() {
//        textField2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (!setInformationButton.isVisible()) {
//                    item = items.findItem(textField2.getText());
//                    label.setText("Product Description:");
//                    textField1.setVisible(true);
//                    textField2.setVisible(true);
//                    textField2.setText(item.getDescription());
//                    textField1.setText(Double.toString(item.getQuantity()));
//                    label3.setVisible(true);
//                    deleteProductButton.setVisible(true);
//                    setInformationButton.setVisible(true);
//                }
//            }
//        });
//        setInformationButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (!textField2.getText().equals("")) {
//                    if (!textField1.getText().equals("")) {
//                        try {
//                            item.setQuantity(Double.parseDouble(textField1.getText()));
//                            item.setDescription(textField2.getText());
//                        } catch (NumberFormatException f) {
//                            label3.setText("Enter a number please");
//                        }
//                    } else {
//                        textField1.setText("Please enter a quantity");
//                    }
//                } else {
//                    textField2.setText("Please enter a description");
//                }
//            }
//        });
//    }
//
//    public static void changeProductQuantity(CarriedItems a) {
//        items = a;
//
//        JFrame frame = new JFrame("ChangePQ");
//        frame.setContentPane(new ChangePQ().pane);
//        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
//    }
//
//    {
//// GUI initializer generated by IntelliJ IDEA GUI Designer
//// >>> IMPORTANT!! <<<
//// DO NOT EDIT OR ADD ANY CODE HERE!
//        $$$setupUI$$$();
//    }
//
//    /**
//     * Method generated by IntelliJ IDEA GUI Designer
//     * >>> IMPORTANT!! <<<
//     * DO NOT edit this method OR call it in your code!
//     *
//     * @noinspection ALL
//     */
//    private void $$$setupUI$$$() {
//        pane = new JPanel();
//        pane.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(6, 2, new Insets(0, 0, 0, 0), -1, -1));
//        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
//        pane.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 2, com.intellij.uiDesigner.core.G
// ridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.
// core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
//        label = new JLabel();
//        label.setText("Enter the code for the item");
//        pane.add(label, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 2, com.intellij.uiDesigner.core.Gr
// idConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.Gri
// dConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0,
// false));
//        textField2 = new JTextField();
//        pane.add(textField2, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 2, com.intellij.uiDesigner.co
// re.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigne
// r.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, ne
// w Dimension(150, -1), null, 0, false));
//        setInformationButton = new JButton();
//        setInformationButton.setText("Set Information");
//        setInformationButton.setVisible(false);
//        pane.add(setInformationButton, new com.intellij.uiDesigner.core.GridConstraints(5, 1, 1, 1, com.intellij.uiD
// esigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intel
// lij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_
// CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
//        deleteProductButton = new JButton();
//        deleteProductButton.setText("Delete Product");
//        deleteProductButton.setVisible(false);
//        pane.add(deleteProductButton, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1, com.intellij.uiDe
// signer.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intelli
// j.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_C
// AN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
//        textField1 = new JTextField();
//        textField1.setVisible(false);
//        pane.add(textField1, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 2, com.intellij.uiDesigner.cor
// e.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner
// .core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new
// Dimension(150, -1), null, 0, false));
//        label3 = new JLabel();
//        label3.setText("Quantity");
//        label3.setVisible(false);
//        pane.add(label3, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 2, com.intellij.uiDesigner.core.Gr
// idConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.Grid
// Constraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, fa
// lse));
//    }

//
//    /**
//     * @noinspection ALL
//     */
//    public JComponent $$$getRootComponent$$$() {
//        return pane;
//    }
//}
