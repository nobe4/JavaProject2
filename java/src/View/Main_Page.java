package View;

import Controller.Database_Controller;

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
    private Teacher_Page teacher_page;


    public Main_Page(Database_Controller databaseController) throws HeadlessException {
        this.setTitle("Login");

        //login_page = new Login_Page();
        //student_page = new Student_Page(databaseController);
        teacher_page = new Teacher_Page(databaseController);
        //edit_page = new Edit_Page();

        this.setContentPane(teacher_page.getMainPanel());
        this.setSize(500, 500);
        this.setMinimumSize(new Dimension(400, 400));
        this.setVisible(true);

        this.addListeners();
    }

    public void addListeners() {
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
