class Harsh {
    int a = 10;
    public int b = 20;
    private int c = 30;
    protected int d = 40;

    public void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

}

public class accessModifiers {
    public static void main(String[] args) {

        Harsh h = new Harsh();
        h.display();

    }

}
