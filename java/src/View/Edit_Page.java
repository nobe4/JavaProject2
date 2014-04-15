package View;

import Controller.Custom_Exception;
import Controller.Database_Controller;
import Model.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by padawan on 4/2/14.
 */
public class Edit_Page {
    private JTabbedPane mainPane;
    private JPanel mainPanel;

    private JTextField moduleNameInput;
    private CustomJComboBox moduleTeacherChoice;
    private JComboBox moduleYearChoice;
    private JButton moduleDeleteButton;
    private JButton moduleChangeButton;
    private JButton moduleAddButton;
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
    private CustomJComboBox gradeStudentChoice;
    private CustomJComboBox gradeModuleChoice;
    private JButton gradeAddButton;
    private JButton gradeDiscardButton;
    private JButton gradeChangeButton;
    private JButton gradeDeleteButton;

    private CustomJComboBox assistantStudentChoice;
    private CustomJComboBox assistantModuleChoice;
    private JButton assistantAddButton;
    private JButton assistantDiscardButton;
    private JButton assistantChangeButton;
    private JButton assistantDeleteButton;

    private CustomJComboBox tutorTeacherChoice;
    private CustomJComboBox tutorStudentChoice;
    private JButton tutorAddButton;
    private JButton tutorDeleteButton;
    private JButton tutorChangeButton;
    private JButton tutorDiscardButton;
    private CustomJComboBox gradeTeacherChoice;
    private JTextField teacherNameInput;
    private JTextField teacherEmaiInput;
    private JTextField teacherPasswordInput;
    private CustomJComboBox teacherSpecialityChoice;
    private JButton teacherDiscardButton;
    private JButton teacherDeleteButton;
    private JButton teacherChangeButton;
    private JButton teacherAddButton;

    private Database_Controller databaseController;

    private int currentId = -1;

    public Edit_Page(final Database_Controller databaseController) {
        this.databaseController = databaseController;
        this.setListeners();


    }

    private void setListeners() {
        this.mainPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                currentId = -1;
                updateChoices(((JTabbedPane) changeEvent.getSource()).
                        getSelectedIndex());
            }
        });

        setDiscardListeners();
        setDeleteListeners();
        setAddListeners();
        setEditListeners();

    }

    private void setEditListeners() {
        moduleChangeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    databaseController.getMainController().setModule(currentId, moduleNameInput.getText(), moduleYearChoice.getSelectedIndex() + 1, moduleTeacherChoice.getSelectedId());
                } catch (Custom_Exception e) {
                    e.printStackTrace();
                }
            }
        });

        tutorChangeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    databaseController.getMainController().setTutor(currentId, tutorStudentChoice.getSelectedId(), tutorTeacherChoice.getSelectedId());
                } catch (Custom_Exception e) {
                    e.printStackTrace();
                }
            }
        });
        moduleChangeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    databaseController.getMainController().setModule(currentId, moduleNameInput.getText(), moduleYearChoice.getSelectedIndex() + 1, moduleTeacherChoice.getSelectedId());
                } catch (Custom_Exception e) {
                    e.printStackTrace();
                }
            }
        });
        studentChangeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    databaseController.getMainController().setStudent(currentId, studentNameInput.getText(), studentMailInput.getText()
                            , studentPasswordInput.getText(), studentSpecialityChoice.getSelectedId()
                            , false, studentYearChoice.getSelectedIndex() + 1);
                } catch (Custom_Exception e) {
                    e.printStackTrace();
                }
            }
        });
        teacherChangeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    databaseController.getMainController().setTeacher(currentId, teacherNameInput.getText(), teacherEmaiInput.getText()
                            , teacherPasswordInput.getText(), teacherSpecialityChoice.getSelectedId()
                            , false);
                } catch (Custom_Exception e) {
                    e.printStackTrace();
                }
            }


        });
        gradeChangeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    databaseController.getMainController().setGrade(currentId, Double.valueOf(gradeValueInput.getText()), Double.valueOf(gradeCoefInput.getText()), gradeStudentChoice.getSelectedId(), gradeTeacherChoice.getSelectedId(), gradeModuleChoice.getSelectedId());
                } catch (Custom_Exception e) {
                    e.printStackTrace();
                }
            }
        });
        assistantChangeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    databaseController.getMainController().addAssistant(currentId, assistantStudentChoice.getSelectedId(), assistantModuleChoice.getSelectedId());
                } catch (Custom_Exception e) {
                    e.printStackTrace();
                }
            }

        });

    }

    private void setDeleteListeners() {
        moduleDeleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    databaseController.getMainController().removeModule(currentId);
                } catch (Custom_Exception e) {
                    e.printStackTrace();
                }
            }
        });
        studentDeleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    databaseController.getMainController().removeStudent(currentId);
                } catch (Custom_Exception e) {
                    e.printStackTrace();
                }
            }
        });
        teacherDeleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    databaseController.getMainController().removeTeacher(currentId);
                } catch (Custom_Exception e) {
                    e.printStackTrace();
                }
            }
        });
        gradeDeleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    databaseController.getMainController().removeGrade(currentId);
                } catch (Custom_Exception e) {
                    e.printStackTrace();
                }
            }
        });
        assistantDeleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    databaseController.getMainController().removeAssistant(currentId);
                } catch (Custom_Exception e) {
                    e.printStackTrace();
                }
            }
        });
        tutorDeleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    databaseController.getMainController().removeTutor(currentId);
                } catch (Custom_Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void setDiscardListeners() {
        this.moduleDiscardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                emptyFields(0);
            }
        });
        this.studentDiscardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                emptyFields(1);
            }
        });
        this.teacherDiscardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                emptyFields(2);
            }
        });
        this.gradeDiscardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                emptyFields(3);
            }
        });
        this.assistantDiscardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                emptyFields(4);
            }
        });
        this.tutorDiscardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                emptyFields(5);
            }
        });
    }

    private void setAddListeners() {
        tutorAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    databaseController.getMainController().addTutor(-1, tutorStudentChoice.getSelectedId(), tutorTeacherChoice.getSelectedId());
                } catch (Custom_Exception e) {
                    e.printStackTrace();
                }
            }
        });
        moduleAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    databaseController.getMainController().addModule(-1, moduleNameInput.getText(), moduleYearChoice.getSelectedIndex() + 1, moduleTeacherChoice.getSelectedId());
                } catch (Custom_Exception e) {
                    e.printStackTrace();
                }
            }
        });
        studentAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    databaseController.getMainController().addStudent(-1, studentNameInput.getText(), studentMailInput.getText()
                            , studentPasswordInput.getText(), studentSpecialityChoice.getSelectedId()
                            , false, studentYearChoice.getSelectedIndex() + 1);
                } catch (Custom_Exception e) {
                    e.printStackTrace();
                }
            }
        });
        teacherAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    databaseController.getMainController().addTeacher(-1, teacherNameInput.getText(), teacherEmaiInput.getText()
                            , teacherPasswordInput.getText(), teacherSpecialityChoice.getSelectedId()
                            , false);
                } catch (Custom_Exception e) {
                    e.printStackTrace();
                }
            }


        });
        gradeAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    databaseController.getMainController().addGrade(-1, Double.valueOf(gradeValueInput.getText()), Double.valueOf(gradeCoefInput.getText()), gradeStudentChoice.getSelectedId(), gradeTeacherChoice.getSelectedId(), gradeModuleChoice.getSelectedId());
                } catch (Custom_Exception e) {
                    e.printStackTrace();
                }
            }
        });
        assistantAddButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    databaseController.getMainController().addAssistant(-1, assistantStudentChoice.getSelectedId(), assistantModuleChoice.getSelectedId());
                } catch (Custom_Exception e) {
                    e.printStackTrace();
                }
            }

        });
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
        } else {
            currentId = id;
            switch (tab) {
                case 0:
                    fillModule(id);
                    break;
                case 1:
                    fillStudent(id);
                    break;
                case 2:
                    fillTeacher(id);
                    break;
                case 3:
                    fillGrade(id);
                    break;
                case 4:
                    fillAssistant(id);
                    break;
                case 5:
                    fillTutor(id);
                    break;
            }
        }
    }

    private void emptyFields(int tab) {
        switch (tab) {
            case 0:
                moduleNameInput.setText("");
                moduleTeacherChoice.populate(this.databaseController.getMainController().getTeachers().exportDatas(new String[]{"id", "name"}), 0);
                moduleYearChoice.setSelectedIndex(0);
                break;
            case 1:
                studentNameInput.setText("");
                studentMailInput.setText("");
                studentPasswordInput.setText("");
                studentYearChoice.setSelectedIndex(0);
                studentSpecialityChoice.populate(this.databaseController.getMainController().getModules().exportDatas(new String[]{"id", "name"}), 0);
                break;
            case 2:
                teacherNameInput.setText("");
                teacherEmaiInput.setText("");
                teacherPasswordInput.setText("");
                teacherSpecialityChoice.populate(this.databaseController.getMainController().getModules().exportDatas(new String[]{"id", "name"}), 0);
                break;
            case 3:
                gradeCoefInput.setText("");
                gradeValueInput.setText("");
                gradeModuleChoice.populate(this.databaseController.getMainController().getModules().exportDatas(new String[]{"id", "name"}), 0);
                gradeTeacherChoice.populate(this.databaseController.getMainController().getTeachers().exportDatas(new String[]{"id", "name"}), 0);
                gradeStudentChoice.populate(this.databaseController.getMainController().getStudents().exportDatas(new String[]{"id", "name"}), 0);
                break;
            case 4:
                assistantModuleChoice.populate(this.databaseController.getMainController().getModules().exportDatas(new String[]{"id", "name"}), 0);
                assistantStudentChoice.populate(this.databaseController.getMainController().getStudents().exportDatas(new String[]{"id", "name"}), 0);
                break;
            case 5:
                tutorStudentChoice.populate(this.databaseController.getMainController().getStudents().exportDatas(new String[]{"id", "name"}), 0);
                tutorTeacherChoice.populate(this.databaseController.getMainController().getTeachers().exportDatas(new String[]{"id", "name"}), 0);
                break;
        }
    }

    private void updateChoices(int tab) {
        switch (tab) {
            case 0:
                moduleTeacherChoice.populate(this.databaseController.getMainController().getTeachers().exportDatas(new String[]{"id", "name"}), 0);
                break;
            case 1:
                studentSpecialityChoice.populate(this.databaseController.getMainController().getModules().exportDatas(new String[]{"id", "name"}), 0);
                break;
            case 2:
                teacherSpecialityChoice.populate(this.databaseController.getMainController().getModules().exportDatas(new String[]{"id", "name"}), 0);
                break;
            case 3:
                gradeModuleChoice.populate(this.databaseController.getMainController().getModules().exportDatas(new String[]{"id", "name"}), 0);
                gradeTeacherChoice.populate(this.databaseController.getMainController().getTeachers().exportDatas(new String[]{"id", "name"}), 0);
                gradeStudentChoice.populate(this.databaseController.getMainController().getStudents().exportDatas(new String[]{"id", "name"}), 0);
                break;
            case 4:
                assistantModuleChoice.populate(this.databaseController.getMainController().getModules().exportDatas(new String[]{"id", "name"}), 0);
                assistantStudentChoice.populate(this.databaseController.getMainController().getStudents().exportDatas(new String[]{"id", "name"}), 0);
                break;
            case 5:
                tutorStudentChoice.populate(this.databaseController.getMainController().getStudents().exportDatas(new String[]{"id", "name"}), 0);
                tutorTeacherChoice.populate(this.databaseController.getMainController().getTeachers().exportDatas(new String[]{"id", "name"}), 0);
                break;
        }
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

    private void fillTeacher(int id) {
        try {
            Teacher t = this.databaseController.getMainController().getTeacher(id);
            teacherNameInput.setText((String) t.get("name"));
            teacherEmaiInput.setText((String) t.get("email"));
            teacherPasswordInput.setText((String) t.get("password"));
            teacherSpecialityChoice.populate(this.databaseController.getMainController().getModules().exportDatas(new String[]{"id", "name"}), (Integer) t.get("speciality"));
        } catch (Custom_Exception e) {
            e.printStackTrace();
        }
    }

    private void fillGrade(int id) {
        try {
            Grade g = this.databaseController.getMainController().getGrade(id);
            gradeValueInput.setText(String.valueOf(g.get("value")));
            gradeCoefInput.setText(String.valueOf(g.get("coef")));
            gradeStudentChoice.populate(
                    this.databaseController.getMainController().getStudents().exportDatas(new String[]{"id", "name"})
                    , (Integer) g.get("studentId"));
            gradeTeacherChoice.populate(
                    this.databaseController.getMainController().getTeachers().exportDatas(new String[]{"id", "name"})
                    , (Integer) g.get("teacherId"));
            gradeModuleChoice.populate(
                    this.databaseController.getMainController().getModules().exportDatas(new String[]{"id", "name"})
                    , (Integer) g.get("moduleId"));
        } catch (Custom_Exception e) {
            e.printStackTrace();
        }
    }

    private void fillAssistant(int id) {
        try {
            Assistant a = this.databaseController.getMainController().getAssistant(id);
            assistantStudentChoice.populate(
                    this.databaseController.getMainController().getStudents().exportDatas(new String[]{"id", "name"})
                    , (Integer) a.get("studentId"));
            assistantModuleChoice.populate(
                    this.databaseController.getMainController().getModules().exportDatas(new String[]{"id", "name"})
                    , (Integer) a.get("moduleId"));
        } catch (Custom_Exception e) {
            e.printStackTrace();
        }
    }

    private void fillTutor(int id) {
        try {
            Tutor t = this.databaseController.getMainController().getTutor(id);
            tutorTeacherChoice.populate(
                    this.databaseController.getMainController().getTeachers().exportDatas(new String[]{"id", "name"})
                    , (Integer) t.get("teacherId"));
            tutorStudentChoice.populate(
                    this.databaseController.getMainController().getStudents().exportDatas(new String[]{"id", "name"})
                    , (Integer) t.get("studensId"));
        } catch (Custom_Exception e) {
            e.printStackTrace();
        }
    }
}
