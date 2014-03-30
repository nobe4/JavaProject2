package Model;


public class Module extends JSObject {
    public Module() {
        super("name", "year");
    }

    public Module(String name, int year) {
        super("name", "year");
        this.set("name", name);
        this.set("year", year);
    }
}
