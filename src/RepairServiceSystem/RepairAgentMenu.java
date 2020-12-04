package RepairServiceSystem;


import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.event.*;

public class RepairAgentMenu extends JPanel implements ActionListener {
    private JMenuBar topMenu;
   private ArrayList<RepairCase> allRepairCases = new ArrayList<RepairCase>();
    private ArrayList<Customer> allCustomers = new ArrayList<Customer>();

    JMenuItem deleteRepairCase, createRepairCase, updateRepairCase, viewRepairCases;
    JScrollPane scrollPane;
    JTextArea displayCases;

    public RepairAgentMenu() {
        JMenu repairCaseMenu = new JMenu ("Repair Case");
         deleteRepairCase = new JMenuItem ("Delete Repair Case");
        repairCaseMenu.add (deleteRepairCase);
         updateRepairCase = new JMenuItem ("Update Repair Case");
        repairCaseMenu.add (updateRepairCase);
         createRepairCase = new JMenuItem ("Create Repair Case");
        repairCaseMenu.add (createRepairCase);
        viewRepairCases = new JMenuItem("View Repair Cases");
        repairCaseMenu.add(viewRepairCases);

        topMenu = new JMenuBar();
        topMenu.add (repairCaseMenu);

        createRepairCase.addActionListener(this);
        updateRepairCase.addActionListener(this);
        deleteRepairCase.addActionListener(this);
        viewRepairCases.addActionListener(this);





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

    public static void viewRepairCases(ArrayList<RepairCase> allRepairCases){

    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==createRepairCase){
            createCase(allRepairCases, allCustomers);
        }
        if(e.getSource()==updateRepairCase){
            updateCase(allRepairCases);
        }
        if(e.getSource()==deleteRepairCase){
            removeCase(allRepairCases);
        }
        if(e.getSource()==viewRepairCases){
            viewRepairCases(allRepairCases);
        }

    }
}
