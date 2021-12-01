import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Window extends JFrame implements ActionListener {

    HashMap<String,String> users = new HashMap<>();
    JFrame frame = new JFrame();
    JButton bLogin = new JButton("Login");
    JButton bCancel = new JButton("Cancel");
    JLabel lLogin = new JLabel("Login: ");
    JLabel lPassword = new JLabel("Password: ");
    JTextField tLogin = new JTextField("");
    JPasswordField pPassword = new JPasswordField("");
    String usersLogin;
    String usersPassword;

    public Window(HashMap<String,String> users2)
    {
        users = users2;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500,350);
        frame.setTitle("Login Window");
        frame.setLayout(null);

        lLogin.setBounds(70,30,100,20);
        frame.add(lLogin);

        lPassword.setBounds(70,70,100,20);
        frame.add(lPassword);

        bLogin.setBounds(130,130,80,20);
        frame.add(bLogin);
        bLogin.addActionListener(this);

        bCancel.setBounds(230,130,80,20);
        frame.add(bCancel);
        bCancel.addActionListener(this);

        tLogin.setBounds(200,30,150,20);
        frame.add(tLogin);

        pPassword.setBounds(200,70,150,20);
        frame.add(pPassword);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        if(source == bCancel)
        {
            tLogin.setText("");
            pPassword.setText("");
            frame.getContentPane().setBackground(Color.white);
        }
       else if(source == bLogin)
        {
            usersLogin = tLogin.getText();
            usersPassword = String.valueOf(pPassword.getPassword());

            if(users.containsKey(usersLogin))
            {
                if(users.get(usersLogin).equals(usersPassword))
                {
                    frame.getContentPane().setBackground(Color.green);
                }
                else {
                    frame.getContentPane().setBackground(Color.red);
                }
            }
            else
            {
                frame.getContentPane().setBackground(Color.red);
            }
        }

    }
}
