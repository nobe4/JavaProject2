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
}
