package Model;

/**
 * Created by padawan on 3/26/14.
 */
public class Assistant implements Editable {

    private int student; // must be a student id
    private int module; // must be a module id

    @Override
    public <Custom_Type> boolean set(String key, Custom_Type value) {
        return false;
    }

    @Override
    public boolean change(int id, Editable o) {
        return false;
    }

    public Assistant( int student, int module) {

        this.student = student;
        this.module = module;
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
