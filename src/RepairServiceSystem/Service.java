package RepairServiceSystem;

public class Service {

    private String name;
    private String desc;
    private float price;

    public Service(){

        this("n/a", "n/a", 0);

    }

    public Service(String name, String desc, float price){
        setName(name);
        setDesc(desc);
        setPrice(price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public float getPrice() {
        return price;
    }

    public String toString(){
        return getName() + "\t\t" + getDesc() + "\t\t" + getPrice();
    }



}
