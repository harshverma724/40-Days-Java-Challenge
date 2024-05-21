import java.lang.*;

public class print {
    public static void main(String[] args) {
        int a = 10;
        float b = 12.56f;
        char c = 'A';
        String d = "Harsh";

        System.out.print("Values are: " + a + " , " + b + " , " + c + " , " + d);
        System.out.println("Values are: " + a + " , " + b + " , " + c + " , " + d);

        // format specifier
        System.out.printf("%d %f %c %s\n", a, b, c, d);

        // d for decimal value
        System.out.printf("DECIMAL VALUE: %d\n", a);

        // o for octal value
        System.out.printf("OCTAL VALUE: %o\n", a);

        // x for hexadecimal value
        System.out.printf("HEXADECIMAL VALUE: %x\n", a);

        // for float numbers: %f, %e ,%g.

        // f for float value
        System.out.printf("Float Value %f\n", b);

        // e for representation value in power form
        System.out.printf("Float Value %e\n", b);

        // s for String value
        System.out.printf("String: %s\n", d);

        // for format specifier: %[argument_index][flags][width][precision]conversion
        // where, argument_index: 1$, 2$ ,3$, 4$
        // flags: '-','+','','('

        // conversion:
        // char:- c
        // int:- d ,o , x
        // float:- f ,e ,g
        // String:- s

        System.out.printf("%1$c\n", c);
        System.out.printf("%1$c %1$c %1$c\n", c);
        System.out.printf("%1$c %2$f %1$c\n", c, b);
        System.out.printf("%4$d %2$f %3$s %1$c ", c, b, d, a);

    }

}
