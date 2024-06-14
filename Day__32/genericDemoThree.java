class Data<T, K> {
    private T obj;
    private K obj2;

    public void setValue(T v, K f) {
        obj = v;
        obj2 = f;
    }

    public void getValue() {
        System.out.println(obj + " " + obj2);
        ;

    }

}

public class genericDemoThree {
    public static void main(String[] args) {

        Data<Integer, String> d = new Data<>();
        d.setValue(10, "Harsh");
        d.getValue();

    }

}
