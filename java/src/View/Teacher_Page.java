package View;


import javax.swing.*;

public class Teacher_Page {
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
}
