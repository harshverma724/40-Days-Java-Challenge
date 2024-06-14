class Data<T> {
    private T obj;

    public void setValue(T v) {
        obj = v;
    }

    public T getValue() {
        return obj;
    }

}

public class genericDemoOne {

    public static void main(String[] args) {

        Data<String> n = new Data<>();
        n.setValue("12");
        System.out.println(n.getValue());

    }
}
