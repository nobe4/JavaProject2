package View;

import Controller.Collection_Controller;
import Controller.Database_Controller;
import Model.Student;
import Model.Teacher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by padawan on 3/28/14.
 */
public class Main_Page extends JFrame {
    private Login_Page login_page;
    private Student_Page student_page;
    private Teacher_Page teacher_page;
    private Collection_Controller teachers;
    private Collection_Controller students;


    public Main_Page(Database_Controller databaseController) throws HeadlessException {
        this.setTitle("Login");

        teachers = databaseController.getMainController().getTeachers();
        students = databaseController.getMainController().getStudents();

        login_page = new Login_Page();
        student_page = new Student_Page(databaseController);
        teacher_page = new Teacher_Page(databaseController);

        this.setContentPane(login_page.getMainPanel());
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

        login_page.getLoginButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(login_page.getChoiceType());
                checkLogin(login_page.getChoiceType(), login_page.getLogin(), login_page.getPassword());
            }
        });
    }

    public void checkLogin(int type, String login, String password) {
        if (type == 0) {
            Teacher t = (Teacher) teachers.get("name", login);
            if (t != null) {
                if (t.get("password").equals(password)) {
                    logTeacher();
                }
            } else {
                System.out.println("not found");
            }
        } else {
            Student s = (Student) students.get("name", login);
            if (s != null) {
                if (s.get("password").equals(password)) {
                    logStudent();
                }
            } else {
                System.out.println("not found");
            }
        }
    }

    private void logStudent() {
        this.setTitle("Student Page");
        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.removeAll();
        contentPane.revalidate();
        contentPane.repaint();
        this.setContentPane(student_page.getMainPanel());
    }

    private void logTeacher() {
        this.setTitle("Teacher Page");
        JPanel contentPane = (JPanel) this.getContentPane();
        contentPane.removeAll();
        contentPane.revalidate();
        contentPane.repaint();
        this.setContentPane(teacher_page.getMainPanel());
    }
}
