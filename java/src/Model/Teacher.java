package Model;

/**
 * Created by padawan on 3/26/14.
 */
public class Teacher extends Person implements Editable {
      // must be the same id as the person
    private boolean is_tutor;

    @Override
    public <Custom_Type> boolean set(String key, Custom_Type value) {
        return false;
    }

    @Override
    public boolean change(int id, Editable o) {
        return false;
    }

    public Teacher( String name, String email, String password, int speciality, boolean is_tutor) {
        super( name, email, password, PERSON_TYPE.TEACHER, speciality);
        this.is_tutor = is_tutor;
    }
}
