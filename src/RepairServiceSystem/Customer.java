package RepairServiceSystem;

public class Customer {

    private String name;
    private String email;
    private String address;


    public Customer(){
        this("N/A", "N/A", "N/A");
    }

    public Customer(String name, String email, String address){
        setName(name);
        setEmail(email);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return "Name: " + getName() + "\nEmail: " + getEmail() + "\nAddress: " + getAddress();

    }

}
