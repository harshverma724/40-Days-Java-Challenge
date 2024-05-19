import java.util.*;

public class cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float length, bredth, height;
        float front_back, up_down;
        float sides, area, volume;

        System.out.println("Enter Length , Bredth , Height here: ");
        length = sc.nextFloat();
        bredth = sc.nextFloat();
        height = sc.nextFloat();

        front_back = 2 * (length * height);
        up_down = 2 * (length * bredth);
        sides = 2 * (bredth * height);

        area = front_back + up_down + sides;
        volume = length * bredth * height;
        System.out.println("The area of Cuboid is: " + area);
        System.out.println("The Volume of Cuboid is: " + volume);

    }

}
