//package main.ui;
//
//
//import main.model.system.ListOfUsers;
//import main.model.system.Login;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.IOException;
//
//public class LoginScreen {
//    private JTextField usernameTextField;
//    private JPanel panel1;
//    private JPasswordField passwordPasswordField;
//    private JButton loginButton;
//    private Login currentUser;
//    private ListOfUsers users = new ListOfUsers();
//
//    public LoginScreen() {
//        loginButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String username = usernameTextField.getText();
//                String password = passwordPasswordField.getText();
//                try {
//                    users.writeFn();
//                } catch (IOException f) {
//                    System.out.print("exception thrown");
//                }
//                currentUser = users.signIn(username, password);
//                if (currentUser == null) {
//                    System.out.println("null user");
//                } else {
//                    System.out.println(currentUser.getMembership().name);
//                    display.runPOS(currentUser, users);
//                }
//            }
//        });
//    }
//
//    public static void main(String[] args) {
//        // run user recovery
//        JFrame frame = new JFrame("LoginScreen");
//        frame.setContentPane(new LoginScreen().panel1);
//        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
//
//
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
//        usernameTextField = new JTextField();
//        usernameTextField.setText("Username");
//        panel1.add(usernameTextField, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
//        passwordPasswordField = new JPasswordField();
//        passwordPasswordField.setText("");
//        panel1.add(passwordPasswordField, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
//        loginButton = new JButton();
//        loginButton.setText("Login");
//        panel1.add(loginButton, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
//    }
//
//    /**
//     * @noinspection ALL
//     */
//    public JComponent $$$getRootComponent$$$() {
//        return panel1;
//    }
//}