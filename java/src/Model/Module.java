package Model;


public class Module extends JSObject {
    public Module() {
        super("name", "year", "teacherId");
    }

    public Module(String name, int year, int teacherId) {
        super("name", "year", "teacherId");
        this.set("name", name);
        this.set("year", year);
        this.set("teacherId", teacherId);
    }
}
