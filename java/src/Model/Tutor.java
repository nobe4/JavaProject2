package Model;


public class Tutor extends JSObject {
    public Tutor() {
        super("studentId", "teacherId");
    }

    public Tutor(int student, int teacher) {
        super("studentId", "teacherId");
        this.set("studentId", student);
        this.set("teacherId", teacher);
    }
}
