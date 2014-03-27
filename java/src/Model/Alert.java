package Model;

/**
 * Created by padawan on 3/26/14.
 */
public class Alert implements Editable {
    private int student; // must be a student id
    private int tutor; // must be a teacher id
    private int module; // must be a module id
    private String message; // must be a module id


    @Override
    public <Custom_Type> boolean set(String key, Custom_Type value) {
        return false;
    }

    @Override
    public boolean change(int id, Editable o) {
        return false;
    }

    public Alert(int student, int tutor, int module, String message) {
        this.student = student;
        this.tutor = tutor;
        this.module = module;
        this.message = message;
    }

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    public int getTutor() {
        return tutor;
    }

    public void setTutor(int tutor) {
        this.tutor = tutor;
    }

    public int getModule() {
        return module;
    }

    public void setModule(int module) {
        this.module = module;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
