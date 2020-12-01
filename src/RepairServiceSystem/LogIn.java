package RepairServiceSystem;


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LogIn {

    JTextField usernameField;
    JPasswordField passwordField;

    public LogIn(){
        JFrame jFrameWindow = new JFrame("Authentication");

        FlowLayout flowLayout = new FlowLayout();

        jFrameWindow.setLayout(flowLayout);

        jFrameWindow.setSize(400,100);

        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel usernameLabel = new JLabel("Username:");

        jFrameWindow.add(usernameLabel);

        usernameField = new JTextField(10);

        jFrameWindow.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");

        jFrameWindow.add(passwordLabel);

        passwordField = new JPasswordField(10);

        jFrameWindow.add(passwordField);

        TextFieldEventHandler handler = new TextFieldEventHandler();

        usernameField.addActionListener(handler);
        passwordField.addActionListener(handler);

        jFrameWindow.setVisible(true);
    }

    private class TextFieldEventHandler implements ActionListener{

        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == usernameField)
            {
                passwordField.requestFocus();
            }
            if(e.getSource() == passwordField)
            {
                char[] passwordCharacters = passwordField.getPassword();

                String passwordText = new String(passwordCharacters);

                if(usernameField.getText().equals("Joe Bloggs") &&
                        passwordText.equals("123abc"))
                    JOptionPane.showMessageDialog(null,"Welcome to the system " +
                                    usernameField.getText(),"Authenticated",
                            JOptionPane.INFORMATION_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null,"Invalid username/password " +
                            "combination","Not authenticated",JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }


}
