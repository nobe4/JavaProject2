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
    private JTable alertTable;

    public Student_Page(Database_Controller databaseController) {
        this.alertsController = databaseController.getMainController().getAlerts();
        this.gradesController = databaseController.getMainController().getGrades();

        showAlerts();
        showGrades();
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }


    public void showGrades() {
        String[] columnNames = {"moduleId", "coef", "value"};
        Object[][] datas = gradesController.exportDatas(columnNames);
        gradesTable.setModel(new JTable(datas, columnNames).getModel());
        gradesTable.setFillsViewportHeight(true);
    }

    public void showAlerts() {
        String[] columnNames = {"message"};
        Object[][] datas = alertsController.exportDatas(columnNames);
        if (datas.length != 0) {
            alertTable.setModel(new JTable(datas, columnNames).getModel());
        }
        alertTable.setFillsViewportHeight(true);
    }
}
