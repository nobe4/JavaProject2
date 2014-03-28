package View;

import Controller.Collection_Controller;
import Model.Student;

import javax.swing.*;

/**
 * Created by padawan on 3/26/14.
 */
public class Student_Page {
    private JTabbedPane tabbedPane1;
    private JPanel mainPanel;
    private JTable gradesTable;
    private JList alertList;

    public Student_Page() {
        displayGrades();
    }

    public JPanel getMainPanel() {return mainPanel;}

    public void displayGrades(){
    }

    private void createUIComponents() {
        Collection_Controller cs = new Collection_Controller(Student.class);

        String[] columnNames = cs.exportFields();
        Object[][] data = {        };
        gradesTable = new JTable(data, columnNames);
        gradesTable.setFillsViewportHeight(true);
    }
}
