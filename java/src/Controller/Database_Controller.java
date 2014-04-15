package Controller;


public class Database_Controller {
    private Main_Controller mainController = new Main_Controller();

    public Main_Controller getMainController() {
        return mainController;
    }

    public Database_Controller() {
        try {
            mainController.addStudent(-1, "Robert", "ro@bert", "robert1234", 7, false, 1);
            mainController.addStudent(-1, "Boris", "bo@bert", "bobo", 7, false, 1);
            mainController.addStudent(-1, "Michel", "mi@bert", "michou", 8, true, 2);
            mainController.addStudent(-1, "Maxou", "ma@bert", "maxmax", 8, false, 3);
            mainController.addStudent(-1, "A", "ma@bert", "A", 8, false, 3);

            mainController.addTeacher(-1, "Prof chen", "chen@bert", "maxmax", 7, false);
            mainController.addTeacher(-1, "Prof org", "sd@bert", "qsdqsd", 7, true);
            mainController.addTeacher(-1, "Prof red", "qsss@bert", "maxqsdqsmax", 8, false);

            mainController.addModule(-1, "Maths", 2, 4);
            mainController.addModule(-1, "qsdqsd", 2, 5);

            mainController.addAlert(-1, 0, 0, 0, "coucoucocou");

            mainController.addGrade(-1, 12, 0.1, 1, 6, 7);
            mainController.addGrade(-1, 12, 0.1, 0, 5, 7);
            mainController.addGrade(-1, 12, 0.1, 2, 6, 8);
            mainController.addGrade(-1, 12, 0.1, 1, 6, 8);

            mainController.addAssistant(-1, 1, 5);
            mainController.addAssistant(-1, 2, 6);
            //mainController.addTutor(-1,0,0);


        } catch (Custom_Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
