import Controller.Custom_Exception;
import Controller.Main_Controller;
import Model.Student;

/**
 * Created by padawan on 3/26/14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world !");

        test_Collection_Controller();
    }

    public static void test_Collection_Controller(){
        /*Student s = new Student(1,"zer","zer","zer",2,true,2001);
        System.out.println(s.getClass()); // class Model.Student
        System.out.println(Student.class); // class Model.Student

        Collection_Controller sc = new Collection_Controller(Student.class);
        try {
            sc.add(2, new Student(1,"zer","zer","zer",2,true,45));
            sc.add(2, new Teacher(1,"zer","zer","zer",2,true));
            System.out.println(sc.get(2).toString());
        }catch (Custom_Exception custom_exception){
            System.out.println(custom_exception.getMessage());
        }*/

        Main_Controller c = new Main_Controller();
        try {
            Student id = c.addStudent(-1, "Joe", "Doe", "ldqjk", 2, true, 2);
            System.out.println(c.getStudent(0).toString());
            c.removeStudent(0);
            System.out.println(c.getStudent(0).toString());
        } catch (Custom_Exception e) {
            e.printStackTrace();
        }

        System.out.println("coucou");
    }
}
