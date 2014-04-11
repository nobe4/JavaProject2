package Model;


public class Student extends Person {
    public Student() {
        super("name", "email", "password", "type", "speciality", "is_assistant", "year");
        this.set("type", PERSON_TYPE.STUDENT);
    }

    public Student(String name, String email, String password, int speciality, boolean isAssistant, int year) {
        super("name", "email", "password", "type", "speciality", "isAssistant", "year");
        this.set("name", name);
        this.set("email", email);
        this.set("password", password);
        this.set("type", PERSON_TYPE.STUDENT);
        this.set("speciality", speciality);
        this.set("isAssistant", isAssistant);
        this.set("year", year);
    }

}
