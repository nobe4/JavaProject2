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
    private JButton moduleButton;

    private JTextField studentNameInput;
    private JTextField studentMailInput;
    private JTextField studentPasswordInput;
    private JComboBox studentSpecialityChoice;
    private JComboBox studentYearChoice;
    private JButton studentButton;

    private JTextField gradeValueInput;
    private JTextField gradeCoefInput;
    private JComboBox gradeStudentChoice;
    private JComboBox gradeModuleChoice;
    private JComboBox gradeTypeChoice;
    private JButton gradeButton;

    private JComboBox assistantStudentChoice;
    private JComboBox assistantTeacherChoice;
    private JButton assistantButton;

    private JComboBox tutorTeacherChoice;
    private JComboBox tutorModuleChoice;
    private JButton tutorButton;

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JTabbedPane getMainPane() {
        return mainPane;
    }

    public void setOptions(int tab, String text) {
        switch (tab) {
            case 0:
                moduleButton.setText(text);
                break;
            case 1:
                studentButton.setText(text);
                break;
            case 2:
                gradeButton.setText(text);
                break;
            case 3:
                assistantButton.setText(text);
                break;
            case 4:
                tutorButton.setText(text);
                break;

        }

        if (text.equals("Add"))
            emptyFields(tab);
        else
            fillFields(tab);
    }

    private void fillFields(int tab) {
        System.out.println("Fill fields for tab " + String.valueOf(tab));
    }

    private void emptyFields(int tab) {
        System.out.println("Empty fields for tab " + String.valueOf(tab));
    }
}
