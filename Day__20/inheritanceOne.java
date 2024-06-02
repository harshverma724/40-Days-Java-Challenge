class Account {
    private String accountno;
    private String name;
    private String address;
    private String phone;
    private String dob;
    protected double balance;

    public String getAccountNo() {
        return accountno;

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

    public String getDob() {
        return dob;

    }

    public void setAddress(String x) {
        address = x;
    }

    public void setPhone(String x) {
        phone = x;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(String a, String b, String c, String d, String e) {
        accountno = a;
        name = b;
        address = c;
        phone = d;
        dob = e;
        balance = 0;

    }

}

class SavingsAccount extends Account {
    public SavingsAccount(String a, String b, String c, String d, String e) {
        super(a, b, c, d, e);
        // TODO Auto-generated constructor stub
    }

    public void deposit(long amt) {
        balance += amt;
    }

    public void withdraw(long amt) {
        balance -= amt;
    }
}

class LoanAccount extends Account {
    public LoanAccount(String a, String b, String c, String d, String e) {
        super(a, b, c, d, e);
        // TODO Auto-generated constructor stub
    }

    public void payEMI(long amt) {
        balance -= amt;
    }

    public void repay(long amt) {
        if (balance == amt)
            balance = 0;
    }
}

public class inheritanceOne {
    public static void main(String[] args) {

    }

}
