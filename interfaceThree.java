interface Members {
    void callback();

}

class Store {
    Members mem[] = new Members[100];
    int count = 0;

    public Store() {

    }

    void register(Members m) {
        mem[count++] = m;

    }

    void inviteSale() {
        for (int i = 0; i < mem.length; i++) {
            mem[i].callback();
        }

    }

}

class Customers implements Members {

    String name;

    Customers(String n) {
        name = n;
    }

    public void callback() {
        System.out.println("Calling." + name);
    }
}

public class interfaceThree {
    public static void main(String[] args) {

        Store s = new Store();

        Customers c1 = new Customers("john");
        Customers c2 = new Customers("Harsh");

        s.register(c1);
        s.register(c2);
        s.inviteSale();

    }

}
