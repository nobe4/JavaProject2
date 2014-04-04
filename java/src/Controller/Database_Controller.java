package Controller;


public class Database_Controller {
    private Main_Controller mainController = new Main_Controller();

    public Main_Controller getMainController() {
        return mainController;
    }

    public Database_Controller() {
        try {
            mainController.addStudent(0, "Robert", "ro@bert", "robert1234", 1, false, 1);
            mainController.addStudent(-1, "Boris", "bo@bert", "bobo", 2, false, 1);
            mainController.addStudent(-1, "Michel", "mi@bert", "michou", 3, true, 2);
            mainController.addStudent(-1, "Maxou", "ma@bert", "maxmax", 4, false, 3);

            mainController.addTeacher(0, "Prof chen", "chen@bert", "maxmax", 4, false);
            mainController.addTeacher(-1, "Prof org", "sd@bert", "qsdqsd", 5, true);
            mainController.addTeacher(-1, "Prof red", "qsss@bert", "maxqsdqsmax", 4, false);

            mainController.addModule(0, "Maths", 2);

            mainController.addGrade(-1, 90, 0.1, 0, 0, 0);
            mainController.addGrade(-1, 23, 0.2, 0, 0, 0);
            mainController.addGrade(-1, 56, 0.4, 0, 0, 0);
            mainController.addGrade(-1, 77, 0.3, 0, 0, 0);

            mainController.addAlert(-1, 0, 0, 0, "coucoucocou");

            mainController.addGrade(-1, 12, 0.1, 0, 0, 0);

            mainController.addAssistant(-1, 0, 0);
            // mainController.addTutor(-1,0,0);


        } catch (Custom_Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
