package Controller;

/**
 * Created by padawan on 3/27/14.
 */
public class Main_Controller {

    // all controller for all entities in the program
   /* private Collection_Controller alerts = new Collection_Controller(Alert.class);
    private Collection_Controller assistants = new Collection_Controller(Assistant.class);
    private Collection_Controller grades = new Collection_Controller(Grade.class);
    private Collection_Controller inscriptions = new Collection_Controller(Inscription.class);
    private Collection_Controller modules = new Collection_Controller(Module.class);
    private Collection_Controller persons = new Collection_Controller(Person.class);
    private Collection_Controller students = new Collection_Controller(Student.class);
    private Collection_Controller teachers = new Collection_Controller(Teacher.class);
    private Collection_Controller tutors = new Collection_Controller(Tutor.class);

    public Main_Controller() {}

    public Collection_Controller getAlerts() {
        return alerts;
    }

    public Collection_Controller getAssistants() {
        return assistants;
    }

    public Collection_Controller getGrades() {
        return grades;
    }

    public Collection_Controller getInscriptions() {
        return inscriptions;
    }

    public Collection_Controller getModules() {
        return modules;
    }

    public Collection_Controller getPersons() {
        return persons;
    }

    public Collection_Controller getStudents() {
        return students;
    }

    public Collection_Controller getTeachers() {
        return teachers;
    }

    public Collection_Controller getTutors() {
        return tutors;
    }

    public Student addStudent(int id, String name, String email, String password, int speciality, boolean is_assistant, int year) throws Custom_Exception {
        Student s = new Student(name, email, password, speciality, is_assistant, year); // TODO set ID generation
        students.add(id, s);
        return s;
    }

    public Student getStudent(int id) throws Custom_Exception {
        Student s = (Student) students.get(id);
        return s;
    }

    public Student removeStudent(int id) throws Custom_Exception {
        Student s = (Student) students.get(id);
        students.remove(id);
        // todo remove all grade attached to the student
        return s;
    }

    public Module addModule(int id, String name, int year) throws Custom_Exception {
        Module m = new Module(name, year);
        modules.add(id, m);
        return m;
    }

    public Module getModule(int id) throws Custom_Exception {
        Module m = (Module) modules.get(id);
        return m;
    }

    public Module removeModule(int id) throws Custom_Exception {
        Module m = (Module) modules.get(id);
        modules.remove(id);
        // todo remove all grades attached to the module
        return m;
    }

    public Grade addGrade(int id, double value, double coef, int studentId, int teacherId, int moduleId) throws Custom_Exception {
        if(students.get(studentId) == null) throw new Custom_Exception("There is no student with this id");
        if(teachers.get(teacherId) == null) throw new Custom_Exception("There is no teacher with this id");
        if(modules.get(moduleId) == null) throw new Custom_Exception("There is no module with this id");
        Grade g = new Grade(value, coef, studentId, teacherId, moduleId);
        grades.add(id, g);
        return g;
    }

    public Grade getGrade(int id) throws Custom_Exception {
        Grade g = (Grade) grades.get(id);
        return g;
    }

    public Grade removeGrade(int id) throws Custom_Exception {
        Grade g = (Grade) grades.get(id);
        grades.remove(id);
        return g;
    }

    public Teacher addTeacher(int id, String name, String email, String password, int speciality, boolean is_tutor) throws Custom_Exception {
        Teacher t = new Teacher(name, email, password, speciality, is_tutor);
        teachers.add(id, t);
        return t;
    }

    public Teacher getTeacher(int id) throws Custom_Exception {
        Teacher t = (Teacher) teachers.get(id);
        return t;
    }

    public Teacher removeTeacher(int id) throws Custom_Exception {
        Teacher t = (Teacher) teachers.get(id);
        teachers.remove(id);
        return t;
    }

    public Tutor addTutor(int id, int studentId, int teacherId) throws Custom_Exception {
        Tutor t = new Tutor(studentId, teacherId);
        tutors.add(id,t);
        return t;
    }

    public Tutor getTutor(int id) throws Custom_Exception {
        Tutor t = (Tutor) tutors.get(id);
        return t;
    }

    public Tutor removeTutor(int id) throws Custom_Exception {
        Tutor t = (Tutor) tutors.get(id);
        tutors.remove(id);
        return t;
    }

    public Assistant addAssistant(int id, int studentId, int moduleId) throws Custom_Exception {
        Assistant a = new Assistant(studentId, moduleId);
        assistants.add(id, a);
        return a;
    }

    public Assistant getAssistant(int id) throws Custom_Exception {
        Assistant a = (Assistant) assistants.get(id);
        return a;
    }

    public Assistant removeAssistant(int id) throws Custom_Exception {
        Assistant a = (Assistant) assistants.get(id);
        assistants.remove(id);
        return a;
    }

    public Inscription addInscription(int id, int studentId, int moduleId) throws Custom_Exception {
        Inscription a = new Inscription(studentId, moduleId);
        assistants.add(id, a);
        return a;
    }

    public Inscription getInscription(int id) throws Custom_Exception {
        Inscription a = (Inscription) inscriptions.get(id);
        return a;
    }

    public Inscription removeInscription(int id) throws Custom_Exception {
        Inscription a = (Inscription) inscriptions.get(id);
        inscriptions.remove(id);
        return a;
    }

   /* Get/Add/Remove :
            * module - DONE
            * student - DONE
            * grade - DONE
            * teacher - DONE
            * tutor - DONE
            * assistant - DONE
            * inscriptions - DONE
    */
    // todo use the return of the remove method of Collection_Controller to return the object

}
