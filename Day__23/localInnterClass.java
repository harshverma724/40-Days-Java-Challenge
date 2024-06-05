class Harsh {
    public void local() {
        class Inner {
            void display() {
                System.out.println(" hhh ");
            }
        }
        Inner i = new Inner();
        i.display();
    }
}

public class localInnterClass {
    public static void main(String[] args) {

        Harsh h = new Harsh();
        h.local();

    }

}
