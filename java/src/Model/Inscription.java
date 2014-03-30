package Model;


public class Inscription extends JSObject {
    public Inscription() {
        super("studentId", "moduleId");
    }

    public Inscription(int studentId, int moduleId) {
        super("studentId", "moduleId");
        this.set("studentId", studentId);
        this.set("moduleId", moduleId);
    }
}
