package Model;


public class Assistant extends JSObject {
    public Assistant() {
        super("studentId", "moduleId");
    }

    public Assistant(int student, int module) {
        super("studentId", "moduleId");
        this.set("studentId", student);
        this.set("moduleId", module);
    }
}
