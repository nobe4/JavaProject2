package Model;

/**
 * Created by padawan on 3/26/14.
 */
public class Grade implements Editable {
    private int id;
    private double value;
    private double coef;
    private int student; // must be a student id
    private int teacher; //must be a teacher id
    private int module; //must be a student id

    @Override
    public <Custom_Type> boolean set(String key, Custom_Type value) {
        return false;
    }

    public Grade(int id, double value, double coef, int student, int teacher, int module) {
        this.id = id;
        this.value = value;
        this.coef = coef;
        this.student = student;
        this.teacher = teacher;
        this.module = module;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getCoef() {
        return coef;
    }

    public void setCoef(double coef) {
        this.coef = coef;
    }

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    public int getTeacher() {
        return teacher;
    }

    public void setTeacher(int teacher) {
        this.teacher = teacher;
    }

    public int getModule() {
        return module;
    }

    public void setModule(int module) {
        this.module = module;
    }
}
