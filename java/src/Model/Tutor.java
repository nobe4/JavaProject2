package Model;

/**
 * Created by padawan on 3/26/14.
 */
public class Tutor implements Editable {
    private int id;
    private int student; // must be a student id
    private int teacher; // must be a teacher id

    @Override
    public <Custom_Type> boolean set(String key, Custom_Type value) {
        return false;
    }

    public Tutor(int id, int student, int teacher) {
        this.id = id;
        this.student = student;
        this.teacher = teacher;
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

    public int getTeacher() {
        return teacher;
    }

    public void setTeacher(int teacher) {
        this.teacher = teacher;
    }
}
