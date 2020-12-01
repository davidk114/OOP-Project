package RepairServiceSystem;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame {
private JButton raButton;
private JButton cButton;
private JButton aButton;


        public Menu(){
            JFrame frame = new JFrame("Computer Repairs");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel();
            GridLayout gridLayout = new GridLayout(4,1,20,20);
            panel.setLayout(gridLayout);
            panel.setBorder(new EmptyBorder(new Insets(30, 100, 130, 100)));
// Empty Border taken from https://docs.oracle.com/javase/7/docs/api/javax/swing/border/EmptyBorder.html

            JLabel title = new JLabel("Computer Repairs");
            panel.add(title);


            raButton = new JButton("Repair Agent");
            cButton = new JButton("Customer");
            aButton = new JButton("Admin");

            panel.add(raButton);
            panel.add(cButton);
            panel.add(aButton);

            ButtonEventHandler handler = new ButtonEventHandler();
   //         ButtonEventHandler cHandler = new ButtonEventHandler();
     //       ButtonEventHandler aHandler = new ButtonEventHandler();

            raButton.addActionListener(handler);
            cButton.addActionListener(handler);
            aButton.addActionListener(handler);


            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
        }

    public static void main(String[] args) {
        Menu guiApp = new Menu();
    }

    private class ButtonEventHandler implements ActionListener{
            public void actionPerformed(ActionEvent e){

                if(e.getSource() == raButton){


                }
                else if(e.getSource() == cButton){
                JOptionPane.showMessageDialog(null, "Customer", "c", JOptionPane.INFORMATION_MESSAGE);


                }else if(e.getSource() == aButton){
                   JOptionPane.showMessageDialog(null, "Admin", "A", JOptionPane.INFORMATION_MESSAGE);

                }


            }





    }




}
