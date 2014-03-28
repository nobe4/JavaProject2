package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by padawan on 3/26/14.
 */
public class Login_Page extends JFrame{

    private  JPanel mainPanel;

    private JButton loginButton;
    private JPasswordField passwordField;
    private JTextField loginField;

    public Login_Page(String title) throws HeadlessException {
        super(title);
        setSize(200,200);
        setVisible(true);


        this.buildInterface();
        this.createListener();
    }

    public void buildInterface(){
        // create the main panel
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.PAGE_AXIS));
        this.add(mainPanel, BorderLayout.CENTER);

        // create the components
        loginButton = new JButton("Login");
        passwordField = new JPasswordField();
        loginField = new JTextField();

        mainPanel.add(loginField);
        mainPanel.add(passwordField);
        mainPanel.add(loginButton);

    }

    public void createListener(){
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
         
    }
}
