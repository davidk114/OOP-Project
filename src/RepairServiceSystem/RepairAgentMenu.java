package RepairServiceSystem;


import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class RepairAgentMenu extends JPanel implements ActionListener {
    private final ArrayList<RepairCase> allRepairCases = new ArrayList<>();
    private final ArrayList<Customer> allCustomers = new ArrayList<>();

    DefaultListModel<String> l1;
    JMenuItem deleteRepairCase, createRepairCase, updateRepairCase, viewRepairCases;

    public RepairAgentMenu() {

        //Creating GUI
        JLabel title = new JLabel("Welcome Repair Agent");
        JPanel panel = new JPanel();
        panel.add(title);
        panel.setBorder(new EmptyBorder(new Insets(30, 100, 130, 100)));

        JMenu repairCaseMenu = new JMenu ("Repair Case");
         deleteRepairCase = new JMenuItem ("Delete Repair Case");
        repairCaseMenu.add (deleteRepairCase);
         updateRepairCase = new JMenuItem ("Update Repair Case");
        repairCaseMenu.add (updateRepairCase);
         createRepairCase = new JMenuItem ("Create Repair Case");
        repairCaseMenu.add (createRepairCase);
        viewRepairCases = new JMenuItem("View Repair Cases");
        repairCaseMenu.add(viewRepairCases);

        JMenuBar topMenu = new JMenuBar();
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

        JFrame frame = new JFrame ("Repair Agent Menu");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new RepairAgentMenu());
        frame.pack();
        frame.setVisible (true);


    }



    public static void createCase(ArrayList<RepairCase> allRepairCases, ArrayList<Customer> allCustomers){

        //Creating Customer object
        String name = JOptionPane.showInputDialog("Enter customer name:");
        String email = JOptionPane.showInputDialog("Enter customer email:");
        String address = JOptionPane.showInputDialog("Enter customer address");

        Customer c = new Customer(name, email, address);

        allCustomers.add(c);

        JOptionPane.showMessageDialog(null, "Customer added to the system!", "Confirmation", JOptionPane.INFORMATION_MESSAGE);

        //Creating Repair Case Object that uses Customer object
        String faultDesc = JOptionPane.showInputDialog("Enter fault description");
        String serialNo = JOptionPane.showInputDialog("Enter serial number");
        String deviceBrand = JOptionPane.showInputDialog("Enter device brand");

        RepairCase r = new RepairCase(c,faultDesc,serialNo,deviceBrand,"l");
        allRepairCases.add(r);

        JOptionPane.showMessageDialog(null,"Repair Case created!", "Confirmation", JOptionPane.INFORMATION_MESSAGE);

    }

    public static void updateCase(ArrayList<RepairCase> allRepairCases){

        ArrayList<RepairCase> searchRepCase = new ArrayList<RepairCase>();

        int caseId = Integer.parseInt(JOptionPane.showInputDialog("Enter RC number of case you wish to cancel"));

        RepairCase rcUpdate=null;

        for(RepairCase rc : searchRepCase){
            if(rc != null && rc.getCaseId()==caseId){
                rcUpdate = rc;

            }
        }

        String updateChoice = JOptionPane.showInputDialog("Update Case Status");
        rcUpdate.setStatus(updateChoice);

        JOptionPane.showMessageDialog(null, "Repair Case status is now: " + updateChoice, "Updating Case", JOptionPane.INFORMATION_MESSAGE);

        searchRepCase.clear();


    }



    public static void removeCase(ArrayList<RepairCase> allRepairCases){


            ArrayList<RepairCase> searchRepCase = new ArrayList<RepairCase>();

            int caseId = Integer.parseInt(JOptionPane.showInputDialog("Enter RC number of case you wish to cancel"));

            RepairCase rcRemove=null;

            for(RepairCase rc : searchRepCase){
                if(rc != null && rc.getCaseId()==caseId){
                    rcRemove = rc;

                }
            }
            int confirmation = JOptionPane.showConfirmDialog(null,"Do you wish to remove job RC " + rcRemove,"Confirmation", JOptionPane.YES_NO_OPTION);

            if(confirmation==JOptionPane.YES_OPTION){
                allRepairCases.remove(rcRemove);

            }else{
                JOptionPane.showMessageDialog(null,"Cancelled","Cancelled", JOptionPane.INFORMATION_MESSAGE);
            searchRepCase.clear();
            }




    }

    public static void viewRepairCases(ArrayList<RepairCase> allRepairCases){

        //Displaying cases in list format
        String allCases="";
        RepairCase repC = null;
        JFrame viewFrame = new JFrame("All Repair Cases");
        DefaultListModel<String> l1 = new DefaultListModel<>();

        for (RepairCase allRepairCase : allRepairCases) {
            repC = allRepairCase;
            if (repC != null)
                l1.addElement(repC.toStringJList());
        }

        String repCaseFull ="";

        JList list = new JList<>(l1);
        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {

                RepairCase repC;
                JList list = (JList)evt.getSource();
                if (evt.getClickCount() == 2) {
                    int index = list.locationToIndex(evt.getPoint());
                    JOptionPane.showMessageDialog(null, "Working", "Repair Case", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });// Mouse Listener https://stackoverflow.com/questions/5609200/adding-an-actionlistener-to-a-jlist

        list.setBounds(10,10, 400,300);
        viewFrame.add(list);
        viewFrame.setSize(400,500);
        viewFrame.setLayout(null);
        viewFrame.setVisible(true);



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
