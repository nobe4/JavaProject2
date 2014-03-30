import Model.Alert;
import View.Main_Page;

/**
 * Created by padawan on 3/26/14.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world !");

        test_Collection_Controller();
        test_UI_Login();
    }

    private static void test_UI_Login() {
        Main_Page l = new Main_Page();

    }

    public static void test_Collection_Controller(){
        Alert e = new Alert();
        System.out.println(e.getFieldsName());
        e.set("message",3);
        System.out.println(e.getValues());

    }
}
