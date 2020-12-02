package RepairServiceSystem;


import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.event.*;

public class RepairAgentMenu extends JPanel {
    private JMenuBar topMenu;
   private ArrayList<RepairCase> allRepairCases = new ArrayList<RepairCase>();
    private ArrayList<Customer> allCustomers = new ArrayList<Customer>();

    public RepairAgentMenu() {
        JMenu repair_caseMenu = new JMenu ("Repair Case");
        JMenuItem delete_repair_caseItem = new JMenuItem ("Delete Repair Case");
        repair_caseMenu.add (delete_repair_caseItem);
        JMenuItem update_repair_caseItem = new JMenuItem ("Update Repair Case");
        repair_caseMenu.add (update_repair_caseItem);
        JMenuItem create_repair_caseItem = new JMenuItem ("Create Repair Case");
        repair_caseMenu.add (create_repair_caseItem);

        topMenu = new JMenuBar();
        topMenu.add (repair_caseMenu);

        setPreferredSize (new Dimension (400, 500));
        setLayout (null);

        add (topMenu);

        topMenu.setBounds (0, 0, 400, 25);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new RepairAgentMenu());
        frame.pack();
        frame.setVisible (true);


    }

    public static void createCase(ArrayList<RepairCase> allRepairCases, ArrayList<Customer> allCustomers){

        String name = JOptionPane.showInputDialog("Enter customer name:");
        String email = JOptionPane.showInputDialog("Enter customer email:");
        String address = JOptionPane.showInputDialog("Enter customer address");

        Customer c = new Customer(name, email, address);

        allCustomers.add(c);

        JOptionPane.showMessageDialog(null, "Customer added to the system!", "Confirmation", JOptionPane.INFORMATION_MESSAGE);

        String faultDesc = JOptionPane.showInputDialog("Enter fault description");
        String serialNo = JOptionPane.showInputDialog("Enter serial number");
        String deviceBrand = JOptionPane.showInputDialog("Enter device brand");

        RepairCase r = new RepairCase(0,c,faultDesc,serialNo,deviceBrand,"l");

        JOptionPane.showMessageDialog(null,"Repair Case created!", "Confirmation", JOptionPane.INFORMATION_MESSAGE);

    }

    public static void updateCase(ArrayList<RepairCase> allRepairCases){



    }



    public static void removeCase(ArrayList<RepairCase> allRepairCases){

    }

}
