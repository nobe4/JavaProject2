package Model;

/**
 * Created by padawan on 3/26/14.
 */
public class Inscription implements Editable {
    private int id;
    private int student; // must be a student id
    private int module; // must be a module id

    @Override
    public <Custom_Type> boolean set(String key, Custom_Type value) {
        return false;
    }

    public Inscription(int id, int student, int module) {
        this.id = id;
        this.student = student;
        this.module = module;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    public int getModule() {
        return module;
    }

    public void setModule(int module) {
        this.module = module;
    }
}
