package RepairServiceSystem;

 import javax.swing.JOptionPane;

// import java.util.*;

public class TestRepairCase {

    public static void main(String[] args) {

       // Scanner input = new Scanner(System.in);

        System.out.println("Creating a repair case");

        Customer c1 = new Customer();

        c1.setName(JOptionPane.showInputDialog("Enter Customer Name: "));
        c1.setEmail(JOptionPane.showInputDialog("Enter Customer Email: "));
        c1.setAddress(JOptionPane.showInputDialog("Enter Customer Address: "));

        JOptionPane.showMessageDialog(null, "Customer 1: \n" + c1.toString());

        RepairCase r1 = new RepairCase();
        r1.setCustomer(c1);
        r1.setDeviceBrand(JOptionPane.showInputDialog("Brand: "));
        r1.setSerialNo(JOptionPane.showInputDialog("Serial Number: "));
        r1.setFaultDesc(JOptionPane.showInputDialog("Fault Description: "));

        JOptionPane.showMessageDialog(null, "Repair Case" + r1.getCaseId() +
                "\n\n" + r1.toString());

        Service ramInstall = new Service("Ram Install", "Installs Ram", 30);
        Service virusScan = new Service("Virus Scan", "Scan and remove viruses", 20);



    }

    public float getTotal(Service services[]){

        float total=0;

        for(int i=0;i< services.length;i++){
            total = services[i].getPrice() + total;
        }


        return total;
    }

}
