package Model;

/**
 * Created by padawan on 3/26/14.
 */
public class Module implements Editable {

    private String name;
    private int year;

    @Override
    public <Custom_Type> boolean set(String key, Custom_Type value) {
        return false;
    }

    @Override
    public boolean change(int id, Editable o) {
        return false;
    }

    public Module( String name, int year) {

        this.name = name;
        this.year = year;
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
