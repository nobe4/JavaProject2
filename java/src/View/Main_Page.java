package View;

import javax.swing.*;
import java.awt.*;

/**
 * Created by padawan on 3/28/14.
 */
public class Main_Page extends JFrame {
    private Login_Page login;

    public Main_Page() throws HeadlessException {
        this.setTitle("Login");
        login = new Login_Page();
        this.setContentPane(login);
        this.setSize(200,200);
        this.setVisible(true);
    }
}
