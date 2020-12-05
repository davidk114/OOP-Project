package RepairServiceSystem;

public class RepairCase {

    private int caseId;
    private static int caseIdCounter = 0;
    private Customer customer;
    private String faultDesc;
    private String serialNo;
    private String deviceBrand;
    private String status;


    public RepairCase( Customer customer, String faultDesc,
                  String serialNo, String deviceBrand, String status){
   setCaseId(caseId);
    setCustomer(customer);
    setFaultDesc(faultDesc);
    setSerialNo(serialNo);
    setDeviceBrand(deviceBrand);
    setStatus(status);
}

public RepairCase(){
   setCaseId(caseId);
    setCustomer(customer);
    setFaultDesc("n/a");
    setSerialNo("n/a");
    setDeviceBrand("n/a");
    setStatus("Logged");
}



    public void setCaseId(int caseId) {
        this.caseId = caseIdCounter++;

    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
    }

    public void setFaultDesc(String faultDesc) {
        this.faultDesc = faultDesc;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getDeviceBrand() {
        return deviceBrand;
    }

    public String getFaultDesc() {
        return faultDesc;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getCaseId() {
    return this.caseId;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public String getStatus() {
        return status;
    }


    public String toString(){
    return "RC" + getCaseId() + "\n" + getCustomer() + "\n" +
            "\nFault Description: " + getFaultDesc() + "\nDevice Type: " +
            getDeviceBrand() + "\nSerial Number: " + getSerialNo() + "\n\nStatus: " +
            getStatus() + "\n\n";
    }

    public String toStringJList(){
    return "RC" + getCaseId() + "\t\t" + "       ||      " + customer.getName() + "\t\t         ||      " + getDeviceBrand() + "        \t\t\t||         " + getStatus();

    }


}
