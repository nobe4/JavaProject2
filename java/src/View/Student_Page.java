package View;

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
        String[] columnNames = {"Id", "Module", "Teacher", "Grade"};
        Object[][] data = {
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,4,5}
        };
        gradesTable = new JTable(data, columnNames);
        gradesTable.setFillsViewportHeight(true);
    }
}
