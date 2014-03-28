package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by padawan on 3/28/14.
 */
public class Main_Page extends JFrame {
    private Login_Page login_page;
    private Student_Page student_page;

    public Main_Page() throws HeadlessException {
        this.setTitle("Login");

        login_page = new Login_Page();
        student_page = new Student_Page();

        this.setContentPane(student_page.getMainPanel());
        this.setSize(500,500);
        this.setVisible(true);

        this.addListeners();
    }

    public void addListeners(){
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
