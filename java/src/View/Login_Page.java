package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by padawan on 3/26/14.
 */
public class Login_Page extends JFrame{

    private JButton loginButton;
    private JPasswordField passwordField;
    private JTextField loginField;

    public Login_Page(String title) throws HeadlessException {
        super(title);
        WindowListener l = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };


        addWindowListener(l);
        setSize(200,200);
        setVisible(true);

    }

    public void buildInterface(){
        this.loginButton = new JButton("Login");
        this.passwordField = new JPasswordField();
        this.loginField = new JTextField();
        this.add(this.loginButton);
    }
}
