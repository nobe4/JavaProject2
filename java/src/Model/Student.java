package Model;

/**
 * Created by padawan on 3/26/14.
 */
public class Student extends Person implements Editable {
    private int id; // must be the same id as the person
    private boolean is_assistant;
    private int year;


    @Override
    public <Custom_Type> boolean set(String key, Custom_Type value) {
        return false;
    }

    public Student(int id, String name, String email, String password, PERSON_TYPE type, int speciality, boolean is_assistant, int year) {
        super(id, name, email, password, type, speciality);
        id = id;
        this.is_assistant = is_assistant;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIs_assistant() {
        return is_assistant;
    }

    public void setIs_assistant(boolean is_assistant) {
        this.is_assistant = is_assistant;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
