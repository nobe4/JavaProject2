package View;

import Controller.Collection_Controller;
import Controller.Database_Controller;

import javax.swing.*;


public class Student_Page {
    private Collection_Controller gradesController;
    private Collection_Controller alertsController;

    private JTabbedPane tabbedPane1;
    private JPanel mainPanel;
    private JTable gradesTable;
    private JList alertList;

    public Student_Page(Database_Controller databaseController) {
        this.alertsController = databaseController.getMainController().getAlerts();
        this.gradesController = databaseController.getMainController().getGrades();

        System.out.println(this.alertsController);
        String[] columnNames = gradesController.exportFields();
        Object[][] datas = gradesController.exportDatas(columnNames);
        gradesTable.setModel(new JTable(datas, columnNames).getModel());
        gradesTable.setFillsViewportHeight(true);
    }

    public JPanel getMainPanel() {return mainPanel;}
}
