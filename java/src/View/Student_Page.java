package View;

import Controller.Collection_Controller;
import Controller.Custom_Exception;
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
        try {
            cs.add(0, new Student("qsdh", "kjh", "lkj", 3, true, 23));
            cs.add(1, new Student());
            cs.add(2, new Student());
            String[] columnNames = {"name", "year"};
            Object[][] datas = cs.exportDatas(columnNames);
            gradesTable = new JTable(datas, columnNames);
            //gradesTable.setFillsViewportHeight(true);
        } catch (Custom_Exception e) {
            e.printStackTrace();
        }


        //String[] columnNames = cs.exportFields();
        //Object[][] data = cs.exportDatas();
        //gradesTable = new JTable();//datas, columnNames);
        gradesTable.setFillsViewportHeight(true);
    }
}
