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

public class genericDemoTwo {
    public static void main(String[] args) {

        MyArray<Integer> m = new MyArray<>();
        m.append(12);
        m.append(13);
        m.append(14);

        m.display();

    }

}
