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
//public class ManualDescrip {
//    private JPanel panel1;
//    private JTextField textField1;
//    private JButton button1;
//    static Item item;
//    static CarriedItems items;
//    static JFrame frame;
//
//    public ManualDescrip() {
//        button1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //stuff
//                if (!textField1.getText().equals("")) {
//                    item.setDescription(textField1.getText());
//                    frame.dispose();
//                    ProductInfo.productInfo(item, items);
//                }
//
//            }
//        });
//    }
//
//    public static void manDes(Item a, CarriedItems b) {
//        item = a;
//        items = b;
//        frame = new JFrame("ChangePQ");
//        frame.setContentPane(new ManualDescrip().panel1);
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
//        panel1 = new JPanel();
//        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));
//        final JLabel label1 = new JLabel();
//        label1.setText("Please enter the description of the item");
//        panel1.add(label1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
//        textField1 = new JTextField();
//        panel1.add(textField1, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
//        button1 = new JButton();
//        button1.setText("OK");
//        panel1.add(button1, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
//    }
//
//    /**
//     * @noinspection ALL
//     */
//    public JComponent $$$getRootComponent$$$() {
//        return panel1;
//    }
//}