package Controller;

import Model.*;

/**
 * Created by padawan on 3/27/14.
 */
public class Main_Controller {

    // all controller for all entities in the program
    private Collection_Controller alerts = new Collection_Controller(Alert.class);
    private Collection_Controller assistants = new Collection_Controller(Assistant.class);
    private Collection_Controller grades = new Collection_Controller(Grade.class);
    private Collection_Controller inscriptions = new Collection_Controller(Inscription.class);
    private Collection_Controller modules = new Collection_Controller(Module.class);
    private Collection_Controller persons = new Collection_Controller(Person.class);
    private Collection_Controller students = new Collection_Controller(Student.class);
    private Collection_Controller teachers = new Collection_Controller(Teacher.class);
    private Collection_Controller tutors = new Collection_Controller(Tutor.class);

    public int addStudent(String name, String email, String password, int speciality, boolean is_assistant, int year) throws Custom_Exception {
        int id = 1;
        Student s = new Student(id, name, email, password, speciality, is_assistant, year); // TODO set ID generation
        students.add(id, s);
        return id;
    }

    public Student getStudent(int id) throws Custom_Exception {
        Student s = (Student) students.get(id);
        return s;
    }

    public Student removeStudent(int id) throws Custom_Exception {
        Student s = (Student) students.get(id);
        students.remove(id);
        return s;
    }



   /* View/Add/Modify/Remove :
            * module
            * student
            * grade
            * teacher
            * tutor
            * assistant
            * inscriptions */


}
