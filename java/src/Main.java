import Controller.Collection_Controller;
import Controller.Custom_Exceptions;
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
        cc.add(2, new String("foo"));
        try {
            System.out.println(cc.get(1).toString());

        }catch (Custom_Exceptions custom_exceptions){
            System.out.println(custom_exceptions.getMessage());
        }

        System.out.println("coucou");
    }
}
