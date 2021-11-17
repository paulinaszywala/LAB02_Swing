import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {

        BaseOfUsers baseOfUsers = new BaseOfUsers();

        Window window = new Window(baseOfUsers.getUsers());

    }
}
