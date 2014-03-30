package Model;

/**
 * Created by padawan on 3/26/14.
 */
public class Student extends Person{
    public Student() {
        super("name","email","password","type","speciality","is_assistant","year");
        this.set("type",PERSON_TYPE.STUDENT);
    }
}
