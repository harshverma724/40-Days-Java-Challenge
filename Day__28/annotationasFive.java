import java.lang.annotation.*;

@interface My {

    String name();

    String Dept() default "CSE";

    String Section();

}

@My(name = "Harsh", Section = "J")
public class annotationasFive {
    @My(name = "Harsh", Section = "J")
    public static void main(String[] args) {
        @My(name = "Harsh", Dept = "CSE", Section = "J")
        int x;
    }

}
