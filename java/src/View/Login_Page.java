package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by padawan on 3/26/14.
 */
public class Login_Page extends JPanel{

    private JButton loginButton;
    private JPasswordField passwordField;
    private JTextField loginField;

    public Login_Page(){
        this.buildInterface();
        this.createListener();
    }

    public void buildInterface(){
        // create the main panel
        this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));

        // create the components
        loginButton = new JButton("Login");
        passwordField = new JPasswordField();
        loginField = new JTextField();

        this.add(loginField);
        this.add(passwordField);
        this.add(loginButton);

    }

    public void createListener(){
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkLogin();
            }
        });
    }

    public boolean checkLogin(){
        System.out.println("check login");
        return true;
    }
}
