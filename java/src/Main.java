import Controller.Collection_Controller;
import Controller.Custom_Exception;
import Model.Student;
import Model.Teacher;

/**
 * Created by padawan on 3/26/14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world !");

        test_Collection_Controller();
    }

    public static void test_Collection_Controller(){
        Student s = new Student();
        System.out.println(s.getClass()); // class Model.Student
        System.out.println(Student.class); // class Model.Student

        Collection_Controller sc = new Collection_Controller(Student.class);
        try {
            sc.add(2, new Student());
            sc.add(2, new Teacher());
            //cc.add(2, new String("foo"));
            System.out.println(sc.get(2).toString());
            //sc.set(3,"coucou","coucou");
        }catch (Custom_Exception custom_exception){
            System.out.println(custom_exception.getMessage());
        }

        System.out.println("coucou");
    }
}
