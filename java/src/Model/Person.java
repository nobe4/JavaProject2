package Model;

/**
 * Created by padawan on 3/26/14.
 */
public abstract class Person extends JSObject{
    public enum PERSON_TYPE{TEACHER, STUDENT}

    protected Person(String... fields) {
        super(fields);
    }
}
