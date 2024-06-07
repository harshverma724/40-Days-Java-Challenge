class StackUnderFlow extends Exception {
    public String toString() {
        return "Stack Underflow.";
    }

}

class StackOverflow extends Exception {
    public String toString() {
        return "Stack Overflow.";
    }

}

class Stack {
    int size;
    int top = -1;
    int s[];

    public Stack(int x) {
        size = x;
        s = new int[size];
    }

    public void push(int x) throws StackOverflow {
        if (top == size - 1) {
            throw new StackOverflow();
        } else
            top++;
        s[top] = x;
    }

    public int pop() throws StackUnderFlow {
        int x = -1;
        if (top == -1) {
            throw new StackUnderFlow();
        }
        x = s[top];
        top--;
        return x;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(s[i]);
        }
    }

}

public class exceptionhandlingOne {
    public static void main(String[] args) {

        Stack s = new Stack(5);
        try {
            s.push(3);
            s.push(4);
            s.push(5);
            s.push(6);
            s.push(7);
            // s.push(8);
        } catch (StackOverflow e) {
            System.out.println(e);
        }
        s.show();

    }

}
