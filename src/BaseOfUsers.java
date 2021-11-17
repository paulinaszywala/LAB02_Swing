import java.util.HashMap;
import java.util.Map;

public class BaseOfUsers {

    HashMap<String,String> users = new HashMap<String,String>();

    BaseOfUsers()
    {
        users.put("Kasia", "haslo");  //login: Kasia   hasło: haslo
        users.put("Ola", "123");
        users.put("Olek78", "haslo123");
        users.put("Kacper000", "haslo000");
    }

    protected HashMap getUsers(){
        return users;
    }


}
