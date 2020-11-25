package RepairServiceSystem;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Computer Repairs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        JButton raButton = new JButton("Repair Agent");
        JButton cButton = new JButton("Customer");
        JButton aButton = new JButton("Admin");
        frame.getContentPane().add(raButton);
         raButton.setSize(200,40);
        frame.getContentPane().add(cButton);
        //cButton
        frame.getContentPane().add(aButton);

        GridLayout gridLayout = new GridLayout();
        frame.setLayout(gridLayout);
        gridLayout.setHgap(5);


        frame.setVisible(true);


    }

}
