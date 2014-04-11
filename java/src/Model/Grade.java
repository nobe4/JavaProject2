package Model;


public class Grade extends JSObject {
    public Grade() {
        super("value", "coef", "studentId", "teacherId", "moduleId");
    }

    public Grade(double value, double coef, int studentId, int teacherId, int moduleId) {
        super("value", "coef", "studentId", "teacherId", "moduleId");
        this.set("value", value);
        this.set("coef", coef);
        this.set("studentId", studentId);
        this.set("teacherId", teacherId);
        this.set("moduleId", moduleId);
    }
}
