class ATM {
    synchronized public void checkBalance(String name) {
        System.out.println(name + " is Checking Balance");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
    }

    synchronized public void withdraw(String name, int amount) {
        System.out.print(name + " is Withdrawing ");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        System.out.println(amount + " Rupee Only.");
    }
}

class Customer extends Thread {
    ATM atm;
    String name;
    int amount;

    public Customer(String name, ATM a, int amount) {
        this.name = name;
        atm = a;
        this.amount = amount;

    }

    public void useATM() {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    public void run() {
        useATM();

    }
}

public class multithreadingMonitorOne {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer c1 = new Customer("Harsh", atm, 111110);
        Customer c2 = new Customer("Arun", atm, 110110);

        c1.start();
        c2.start();

    }

}
