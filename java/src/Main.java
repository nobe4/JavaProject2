import Controller.Collection_Controller;
import Controller.Custom_Exception;
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
        Student s = new Student();
        System.out.println(s.getClass()); // class Model.Student
        System.out.println(Student.class); // class Model.Student

        Collection_Controller<String> cc = new Collection_Controller<String>();
        try {
            cc.add(2, new String("foo"));
            cc.add(2, new String("foo"));
            System.out.println(cc.get(1).toString());

        }catch (Custom_Exception custom_exception){
            System.out.println(custom_exception.getMessage());
        }

        System.out.println("coucou");
    }
}
