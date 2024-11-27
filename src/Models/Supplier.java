package Models;

public class Supplier {

    //Field
    private int id;
    private String name;
    private String address;
    private String phone;

    //Constructor
    public Supplier() {
        this.id = 0;
        this.name = null;
        this.address = null;
        this.phone = null;
    }

    public Supplier(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    //Property

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
   
}
