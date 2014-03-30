import Model.JSObject;
import View.Main_Page;

import java.util.ArrayList;

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
        ArrayList<String> fields = new ArrayList<String>();
        fields.add("aze");
        fields.add("zer");
        fields.add("ert");
        fields.add("rty");
        JSObject e = new JSObject(fields);
        System.out.println(e.getFieldsName());

        e.set("aze",2);
        e.set("zer",3);
        e.set("ert",4);
        e.set("rty",5);

        System.out.println(e.getValues());

    }
}
