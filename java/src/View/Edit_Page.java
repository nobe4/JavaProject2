package View;

import Controller.Custom_Exception;
import Controller.Database_Controller;
import Model.Module;
import Model.Student;

import javax.swing.*;

/**
 * Created by padawan on 4/2/14.
 */
public class Edit_Page {
    private JTabbedPane mainPane;
    private JPanel mainPanel;

    private JTextField moduleNameInput;
    private CustomJComboBox moduleTeacherChoice;
    private CustomJComboBox moduleYearChoice;
    private JButton moduleAddButton;
    private JButton moduleDeleteButton;
    private JButton moduleChangeButton;
    private JButton moduleDiscardButton;


    private JTextField studentNameInput;
    private JTextField studentMailInput;
    private JTextField studentPasswordInput;
    private CustomJComboBox studentSpecialityChoice;
    private JComboBox studentYearChoice;
    private JButton studentAddButton;
    private JButton studentDiscardButton;
    private JButton studentDeleteButton;
    private JButton studentChangeButton;

    private JTextField gradeValueInput;
    private JTextField gradeCoefInput;
    private JComboBox gradeStudentChoice;
    private JComboBox gradeModuleChoice;
    private JComboBox gradeTypeChoice;
    private JButton gradeAddButton;
    private JButton gradeDiscardButton;
    private JButton gradeChangeButton;
    private JButton gradeDeleteButton;

    private CustomJComboBox assistantStudentChoice;
    private CustomJComboBox assistantTeacherChoice;
    private JButton assistantAddButton;
    private JButton assistantDiscardButton;
    private JButton assistantChangeButton;
    private JButton assistantDeleteButton;

    private CustomJComboBox tutorTeacherChoice;
    private CustomJComboBox tutorModuleChoice;
    private JButton tutorAddButton;
    private JButton tutorDeleteButton;
    private JButton tutorChangeButton;
    private JButton tutorDiscardButton;

    private Database_Controller databaseController;

    public Edit_Page(Database_Controller databaseController) {
        this.databaseController = databaseController;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JTabbedPane getMainPane() {
        return mainPane;
    }

    public void setAction(int tab, boolean add, int id) {
        if (add) {
            emptyFields(tab);
            switch (tab) {
                case 0:
                    moduleAddButton.setVisible(true);
                    moduleDiscardButton.setVisible(true);
                    moduleChangeButton.setVisible(false);
                    moduleDeleteButton.setVisible(false);
                    break;
                case 1:
                    studentAddButton.setVisible(true);
                    studentDiscardButton.setVisible(true);
                    studentChangeButton.setVisible(false);
                    studentDeleteButton.setVisible(false);
                    break;
                case 2:
                    gradeAddButton.setVisible(true);
                    gradeDiscardButton.setVisible(true);
                    gradeChangeButton.setVisible(false);
                    gradeDeleteButton.setVisible(false);
                    break;
                case 3:
                    assistantAddButton.setVisible(true);
                    assistantDiscardButton.setVisible(true);
                    assistantChangeButton.setVisible(false);
                    assistantDeleteButton.setVisible(false);
                    break;
                case 4:
                    tutorAddButton.setVisible(true);
                    tutorDiscardButton.setVisible(true);
                    tutorChangeButton.setVisible(false);
                    tutorDeleteButton.setVisible(false);
                    break;
            }
        } else {
            switch (tab) {
                case 0:
                    moduleAddButton.setVisible(false);
                    moduleDiscardButton.setVisible(false);
                    moduleChangeButton.setVisible(true);
                    moduleDeleteButton.setVisible(true);
                    fillModule(id);
                    break;
                case 1:
                    studentAddButton.setVisible(false);
                    studentDiscardButton.setVisible(false);
                    studentChangeButton.setVisible(true);
                    studentDeleteButton.setVisible(true);
                    fillStudent(id);
                    break;
                case 2:
                    gradeAddButton.setVisible(false);
                    gradeDiscardButton.setVisible(false);
                    gradeChangeButton.setVisible(true);
                    gradeDeleteButton.setVisible(true);
                    fillGrade(id);
                    break;
                case 3:
                    assistantAddButton.setVisible(false);
                    assistantDiscardButton.setVisible(false);
                    assistantChangeButton.setVisible(true);
                    assistantDeleteButton.setVisible(true);
                    fillAssistant(id);
                    break;
                case 4:
                    tutorAddButton.setVisible(false);
                    tutorDiscardButton.setVisible(false);
                    tutorChangeButton.setVisible(true);
                    tutorDeleteButton.setVisible(true);
                    fillTutor(id);
                    break;
            }
        }
    }

    private void emptyFields(int tab) {
        System.out.println("Empty fields for tab " + String.valueOf(tab));
    }

    private void fillModule(int id) {
        try {
            Module m = this.databaseController.getMainController().getModule(id);
            moduleNameInput.setText((String) m.get("name"));
            moduleTeacherChoice.populate(this.databaseController.getMainController().getTeachers().exportDatas(new String[]{"id", "name"}), (Integer) m.get("teacherId"));
            moduleYearChoice.setSelectedIndex((Integer) m.get("year") - 1);
        } catch (Custom_Exception e) {
            e.printStackTrace();
        }
    }

    private void fillStudent(int id) {
        try {
            Student s = this.databaseController.getMainController().getStudent(id);
            studentNameInput.setText((String) s.get("name"));
            studentMailInput.setText((String) s.get("email"));
            studentPasswordInput.setText((String) s.get("password"));
            studentYearChoice.setSelectedIndex((Integer) s.get("year") - 1);
            studentSpecialityChoice.populate(this.databaseController.getMainController().getModules().exportDatas(new String[]{"id", "name"}), (Integer) s.get("speciality"));
        } catch (Custom_Exception e) {
            e.printStackTrace();
        }
    }

    private void fillGrade(int id) {

    }

    private void fillAssistant(int id) {

    }

    private void fillTutor(int id) {

    }

    private void createUIComponents() {
        moduleTeacherChoice = new CustomJComboBox();
    }
}
