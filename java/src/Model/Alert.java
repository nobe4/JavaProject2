package Model;


public class Alert extends JSObject {
    public Alert() {
        super("studentId", "tutorId", "moduleId", "message");
    }

    public Alert(int student, int tutor, int module, String message) {
        super("studentId", "tutorId", "moduleId", "message");
        this.set("studentId", student);
        this.set("tutorId", tutor);
        this.set("moduleId", module);
        this.set("message", message);
    }
}
