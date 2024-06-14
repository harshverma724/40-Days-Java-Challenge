class MyArray<T> {

    T array[] = (T[]) new Object[4];
    int length = 0;

    public void append(T v) {
        array[length++] = v;

    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }
    }
}

class MyArray2<String> extends MyArray<String> {

    public void show() {
        display();
    }

}

public class genericDemoFour {
    public static void main(String[] args) {

        MyArray2<String> m = new MyArray2<String>();
        m.append("12");
        // m.append(13);
        // m.append(14);

        m.display();
        m.show();

    }

}
