package Model;

/**
 * Created by padawan on 3/26/14.
 */
public class Student extends Person implements Editable {
      // must be the same id as the person
    private boolean is_assistant;
    private int year;


    @Override
    public <Custom_Type> boolean set(String key, Custom_Type value) {
        return false;
    }

    @Override
    public boolean change(int id, Editable o) {
        return false;
    }

    public Student( String name, String email, String password, int speciality, boolean is_assistant, int year) {
        super(name, email, password, PERSON_TYPE.STUDENT, speciality);

        this.is_assistant = is_assistant;
        this.year = year;
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
