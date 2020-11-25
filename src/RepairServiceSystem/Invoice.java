package RepairServiceSystem;

public class Invoice {

    private int invNo;
    private Customer customer;
    private float total = 0;
    private Service services[];

    public Invoice(int invNo, Customer customer, float total, Service[] services){
        setInvNo(invNo);
        setCustomer(customer);
        setTotal(total);
        setServices(services);
    }

    public void setInvNo(int invNo) {
        this.invNo = invNo;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setServices(Service[] services) {
        this.services = services;
    }

    public int getInvNo() {
        return invNo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Service[] getServices() {
        return services;
    }

    public float getTotal(Service services[]){

        float total=0;

        for(int i=0;i< services.length;i++){
            total = services[i].getPrice() + total;
        }


        return total;
    }

    public String toString(){

        String serviceList="";
        for(int i=0;i<services.length;i++){
            serviceList+= services.toString();
        }

        return "Invoice No: " + getInvNo() + "\n" + getCustomer() +
                "\nPurchases:\n=======" + serviceList + "\t\t" + total;
    }

}
