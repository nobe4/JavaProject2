package View;

import javax.swing.*;

/**
 * Created by padawan on 3/28/14.
 */
public class Login_Page {
    private JTextField loginInput;
    private JPasswordField passwordInput;
    private JButton loginButton;
    private JPanel mainPanel;
    private JComboBox typeChoice;

    public String getLogin() {
        return loginInput.getText();
    }

    public String getPassword() {
        return String.valueOf(passwordInput.getPassword());
    }

    public int getChoiceType() {
        return typeChoice.getSelectedIndex();
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public Login_Page() {
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
