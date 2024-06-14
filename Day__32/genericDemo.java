import java.rmi.server.ObjID;

class genericDemo<T> {

    T data[] = (T[]) new Object[3];

    public static void main(String[] args) {

        genericDemo<String> gd = new genericDemo<>();

        gd.data[0] = "Harsh";
        gd.data[1] = "Hi";

        gd.data[2] = "10";

    }
}