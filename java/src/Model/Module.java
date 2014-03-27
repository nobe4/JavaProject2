package Model;

/**
 * Created by padawan on 3/26/14.
 */
public class Module implements Editable {
    private int id;
    private String name;
    private int year;

    @Override
    public <Custom_Type> boolean set(String key, Custom_Type value) {
        return false;
    }

    public Module(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
