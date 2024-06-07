class MyNewException extends Exception {
    public String toString() {
        return "Error";
    }
}

public class userdefineException {
    static int area(int x, int y) throws MyNewException {
        if (x < 0 || y < 0) {
            throw new MyNewException();
        }
        return x * y;

    }

    static void meth2() throws MyNewException {
        System.out.println("Area is: " + area(10, 5));
    }

    public static void main(String[] args) throws MyNewException {
        try {
            meth2();
        } catch (MyNewException e) {
            System.out.println(e);
        }

    }

}
