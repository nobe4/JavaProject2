package Model;


public class Teacher extends Person {
    // must be the same id as the person
    private boolean is_tutor;

    public Teacher() {
        super("name", "email", "password", "type", "speciality", "isTutor");
        this.set("type", PERSON_TYPE.TEACHER);
    }

    public Teacher(String name, String email, String password, int speciality, boolean isTutor) {
        super("name", "email", "password", "type", "speciality", "isTutor");
        this.set("name", name);
        this.set("email", email);
        this.set("password", password);
        this.set("type", PERSON_TYPE.TEACHER);
        this.set("speciality", speciality);
        this.set("isTutor", isTutor);
    }
}
