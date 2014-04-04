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
    private JTable assistantsTable;

    private JButton newStudentButton;
    private JButton newTutorButton;
    private JButton newAssistantButton;
    private JButton newModuleButton;
    private JButton newGradeButton;

    private JTable alertTable;

    private JFrame editFrame;
    private Edit_Page edit_page = new Edit_Page();

    // database attributes
    private Main_Controller mainController;


    public Teacher_Page(Database_Controller dc) {

        // add the main controller to handle collections
        mainController = dc.getMainController();


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
                editFrame.setVisible(true);
                edit_page.getMainPane().setSelectedIndex(0);
                edit_page.setOptions(0, "Add");
            }
        });
        newStudentButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                editFrame.setVisible(true);
                edit_page.getMainPane().setSelectedIndex(1);
                edit_page.setOptions(1, "Add");
            }
        });
        newGradeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                editFrame.setVisible(true);
                edit_page.getMainPane().setSelectedIndex(2);
                edit_page.setOptions(2, "Add");
            }
        });
        newAssistantButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                editFrame.setVisible(true);
                edit_page.getMainPane().setSelectedIndex(0);
                edit_page.setOptions(3, "Add");
            }
        });
        newTutorButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                editFrame.setVisible(true);
                edit_page.getMainPane().setSelectedIndex(0);
                edit_page.setOptions(4, "Add");
            }
        });
    }


    public void fillTables() {

    }
}
