package View;

import javax.swing.*;

/**
 * Created by padawan on 4/2/14.
 */
public class Edit_Page {
    private JTabbedPane mainPane;
    private JPanel mainPanel;

    private JTextField moduleNameInput;
    private JComboBox moduleTeacherChoice;
    private JComboBox moduleYearChoice;
    private JButton moduleAddButton;

    private JTextField studentNameInput;
    private JTextField studentMailInput;
    private JTextField studentPasswordInput;
    private JComboBox studentSpecialityChoice;
    private JComboBox studentYearChoice;
    private JButton studentAddButton;

    private JTextField gradeValueInput;
    private JTextField gradeCoefInput;
    private JComboBox gradeStudentChoice;
    private JComboBox gradeModuleChoice;
    private JComboBox gradeTypeChoice;
    private JButton gradeAddButton;

    private JComboBox assistantStudentChoice;
    private JComboBox assistantTeacherChoice;
    private JButton assistantAddButton;

    private JComboBox tutorTeacherChoice;
    private JComboBox tutorModuleChoice;
    private JButton tutorAddButton;
    private JButton moduleDiscardButton;
    private JButton studentDiscardButton;
    private JButton assistantDiscardButton;
    private JButton tutorDiscardButton;
    private JButton gradeDiscardButton;
    private JButton gradeChangeButton;
    private JButton gradeDeleteButton;
    private JButton moduleDeleteButton;
    private JButton moduleChangeButton;
    private JButton studentDeleteButton;
    private JButton studentChangeButton;
    private JButton assistantChangeButton;
    private JButton assistantDeleteButton;
    private JButton tutorDeleteButton;
    private JButton tutorChangeButton;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JTabbedPane getMainPane() {
        return mainPane;
    }

    public void setOptions(int tab, String text1, String text2, int id) {
        if (text1.equals("Add")) {
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
        }

        else
            fillFields(tab, id);


    }

    private void fillFields(int tab, int id) {
        System.out.println("Fill fields for tab " + String.valueOf(tab));
    }

    private void emptyFields(int tab) {
        System.out.println("Empty fields for tab " + String.valueOf(tab));
    }

    private void fillModule(int id) {

    }

    private void fillStudent(int id) {

    }

    private void fillGrade(int id) {

    }

    private void fillAssistant(int id) {

    }

    private void fillTutor(int id) {

    }
}
