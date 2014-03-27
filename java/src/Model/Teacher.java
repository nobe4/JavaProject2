package Model;

/**
 * Created by padawan on 3/26/14.
 */
public class Teacher extends Person implements Editable {
    private int id; // must be the same id as the person
    private boolean is_tutor;

    @Override
    public <Custom_Type> boolean set(String key, Custom_Type value) {
        return false;
    }

    public Teacher(int id, String name, String email, String password, PERSON_TYPE type, int speciality, boolean is_tutor) {
        super(id, name, email, password, type, speciality);
        id = id;
        this.is_tutor = is_tutor;
    }
}
