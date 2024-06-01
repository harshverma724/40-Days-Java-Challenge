class Product {
    private String itemno;
    private String name;
    private int price;
    private int quantity;

    public String getItemNo() {
        return itemno;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(int x) {
        price = x;
    }

    public void setQuantity(int x) {
        quantity = x;
    }

    public Product(String x, String y) {
        itemno = x;
        name = y;
    }

    public Product(String a, String b, int c, int d) {
        itemno = a;
        name = b;
        setPrice(c);
        setQuantity(d);
    }
}

class Customer {

    private String custid;
    private String name;
    private String address;
    private String phone;

    public String getCustId() {
        return custid;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String x) {
        address = x;
    }

    public void setPhone(String x) {
        phone = x;
    }

    public Customer(String x, String y) {
        custid = x;
        name = y;
    }

    public Customer(String x, String y, String address, String phone) {
        custid = x;
        name = y;
        setAddress(address);
        setPhone(phone);
    }

}

public class constructorTwo {
    public static void main(String[] args) {

    }

}
