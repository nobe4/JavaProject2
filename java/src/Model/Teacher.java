package Model;


public class Teacher extends Person {
    // must be the same id as the person
    private boolean is_tutor;

    public Teacher() {
        super("name", "email", "password", "type", "speciality", "is_tutor");
        this.set("type", PERSON_TYPE.TEACHER);
    }
}
