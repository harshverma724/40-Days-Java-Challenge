
import java.io.*;
import java.util.*;

class Customer implements Serializable {
    String custid;
    String name;
    String Phone;

    static int count = 1;

    public Customer() {

    }

    public Customer(String a, String b) {
        custid = "C" + count;
        count++;
        name = a;
        Phone = b;

    }

    public String toString() {
        return "Customer Details: \n" + "Customer Id: " + custid + "\n" + "Customer Name: " + name + "\n"
                + "Customer Phone: " + Phone;

    }

}

public class StudentChallengeOne {/*
                                   * public static void main(String[] args) throws Exception {
                                   * Customer list[] = { new Customer("Harsh", "9292929223"), new
                                   * Customer("Chandu", "9292929223"),
                                   * new Customer("Ishaan", "9292929223"), new Customer("Steve", "9292929223") };
                                   * 
                                   * FileOutputStream fos = new FileOutputStream(
                                   * "C:\\Users\\harsh\\OneDrive\\Desktop\\java\\FileStreamTwo\\Data.txt.txt");
                                   * ObjectOutputStream oos = new ObjectOutputStream(fos);
                                   * 
                                   * oos.writeInt(list.length);
                                   * 
                                   * for (Customer c : list) {
                                   * oos.writeObject(c);
                                   * 
                                   * }
                                   * fos.close();
                                   * oos.close();
                                   * }
                                   */

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        FileInputStream fis = new FileInputStream(
                "C:\\Users\\harsh\\OneDrive\\Desktop\\java\\FileStreamTwo\\Data.txt.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int length = ois.readInt();

        Customer list[] = new Customer[length];

        for (int i = 0; i < length; i++) {
            list[i] = (Customer) ois.readObject();

        }

        System.out.print("Enter name of Custome: ");
        String name = sc.nextLine();

        for (int i = 0; i < length; i++) {
            if (name.equalsIgnoreCase(list[i].name)) {
                System.out.println(list[i]);
            }

        }

        fis.close();
        ois.close();
    }

}
