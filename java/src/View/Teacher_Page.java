package View;


import Controller.Database_Controller;
import Controller.Main_Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Teacher_Page {


    private enum TAB {MODULE, STUDENT, GRADE, ASSISTANT, TUTOR}

    ;

    private enum ACTION {ADD, SET, DELETE}

    ;

    private JTabbedPane tabbedPane1;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    private JPanel mainPanel;

    private JTable studentsTable;
    private JTable modulesTable;
    private JTable gradeTables;
    private JTable tutorTable;
    private JTable alertTable;

    private JTable assistantsTable;
    private JButton newStudentButton;
    private JButton newTutorButton;
    private JButton newAssistantButton;
    private JButton newModuleButton;

    private JButton newGradeButton;
    private JTable teachersTable;
    private JButton newTeacherButton;

    private JFrame editFrame;
    private Edit_Page edit_page;

    // database attributes
    private Main_Controller mainController;


    public Teacher_Page(Database_Controller dc) {

        // add the main controller to handle collections
        mainController = dc.getMainController();
        edit_page = new Edit_Page(dc);
        fillTables();

        editFrame = new JFrame();
        editFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                editFrame.setVisible(false);
            }
        });
        editFrame.setTitle("Edit");
        editFrame.setSize(500, 500);
        editFrame.setMinimumSize(new Dimension(400, 400));
        editFrame.setContentPane(edit_page.getMainPanel());

        this.addListener();
    }

    public void addListener() {
        newModuleButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                callAction(0, true, -1);
            }
        });
        newStudentButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                callAction(1, true, -1);
            }
        });
        newGradeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                callAction(2, true, -1);
            }
        });
        newAssistantButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                callAction(3, true, -1);
            }
        });
        newTutorButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                callAction(4, true, -1);
            }
        });
    }

    private void callAction(int tab, boolean add, int id) {
        editFrame.setVisible(true);
        edit_page.getMainPane().setSelectedIndex(tab);
        edit_page.setAction(tab, add, id);
    }

    public void fillTables() {
        fillAlertsTable();
        fillAssistantsTable();
        fillGradesTable();
        fillModulesTable();
        fillStudentsTable();
        fillTeachersTable();
        fillTutorsTable();
    }

    public void fillModulesTable() {
        String[] columnNames = mainController.getModules().exportFields();
        Object[][] datas = mainController.getModules().exportDatas(columnNames);
        modulesTable.setModel(new JTable(datas, columnNames).getModel());
        modulesTable.setFillsViewportHeight(true);
    }

    public void fillGradesTable() {
        String[] columnNames = mainController.getGrades().exportFields();
        Object[][] datas = mainController.getGrades().exportDatas(columnNames);
        gradeTables.setModel(new JTable(datas, columnNames).getModel());
        gradeTables.setFillsViewportHeight(true);
    }

    public void fillStudentsTable() {
        String[] columnNames = mainController.getStudents().exportFields();
        Object[][] datas = mainController.getStudents().exportDatas(columnNames);
        studentsTable.setModel(new JTable(datas, columnNames).getModel());
        studentsTable.setFillsViewportHeight(true);
    }

    public void fillTeachersTable() {
        String[] columnNames = mainController.getTeachers().exportFields();
        Object[][] datas = mainController.getTeachers().exportDatas(columnNames);
        teachersTable.setModel(new JTable(datas, columnNames).getModel());
        teachersTable.setFillsViewportHeight(true);
    }

    public void fillTutorsTable() {
        String[] columnNames = mainController.getTutors().exportFields();
        Object[][] datas = mainController.getTutors().exportDatas(columnNames);
        tutorTable.setModel(new JTable(datas, columnNames).getModel());
        tutorTable.setFillsViewportHeight(true);
    }

    public void fillAssistantsTable() {
        String[] columnNames = mainController.getAssistants().exportFields();
        Object[][] datas = mainController.getAssistants().exportDatas(columnNames);
        assistantsTable.setModel(new JTable(datas, columnNames).getModel());
        assistantsTable.setFillsViewportHeight(true);
    }

    public void fillAlertsTable() {
        String[] columnNames = mainController.getAlerts().exportFields();
        Object[][] datas = mainController.getAlerts().exportDatas(columnNames);
        alertTable.setModel(new JTable(datas, columnNames).getModel());
        alertTable.setFillsViewportHeight(true);
    }

    private void createUIComponents() {
        modulesTable = new JTable();
        modulesTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(modulesTable.getValueAt(modulesTable.getSelectedRow(), 0));
                callAction(0, false, (Integer) modulesTable.getValueAt(modulesTable.getSelectedRow(), 0));
            }
        });

        studentsTable = new JTable();
        studentsTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(studentsTable.getValueAt(studentsTable.getSelectedRow(), 0));
                callAction(1, false, (Integer) studentsTable.getValueAt(studentsTable.getSelectedRow(), 0));
            }
        });
    }
}
