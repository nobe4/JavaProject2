package Model;

/**
 * Created by padawan on 3/26/14.
 */
public abstract class Person implements Editable {

    @Override
    public boolean change(int id, Editable o) {
        return false;
    }

    public enum PERSON_TYPE{TEACHER, STUDENT}


    private String name;
    private String email;
    private String password;
    private PERSON_TYPE type;
    private int speciality; // must be a module id

    protected Person( String name, String email, String password, PERSON_TYPE type, int speciality) {

        this.name = name;
        this.email = email;
        this.password = password;
        this.type = type;
        this.speciality = speciality;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PERSON_TYPE getType() {
        return type;
    }

    public void setType(PERSON_TYPE type) {
        this.type = type;
    }

    public int getSpeciality() {
        return speciality;
    }

    public void setSpeciality(int speciality) {
        this.speciality = speciality;
    }
}
