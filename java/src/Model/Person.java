package Model;

/**
 * Created by padawan on 3/26/14.
 */
public abstract class Person {

    public enum PERSON_TYPE{TEACHER, STUDENT}

    private int id;
    private String name;
    private String email;
    private String password;
    private PERSON_TYPE type;
    private int speciality; // must be a module id
}
