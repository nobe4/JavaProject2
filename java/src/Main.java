import Controller.Database_Controller;
import View.Main_Page;

public class Main {
    public static void main(String[] args) {
        Database_Controller databaseController = new Database_Controller();
        Main_Page mainPage = new Main_Page(databaseController);
    }
}