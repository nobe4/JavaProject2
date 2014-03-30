package Model;


public abstract class Person extends JSObject{
    public enum PERSON_TYPE{TEACHER, STUDENT}

    protected Person(String... fields) {
        super(fields);
    }
}
