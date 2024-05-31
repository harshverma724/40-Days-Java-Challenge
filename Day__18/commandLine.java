public class commandLine {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum = sum + Double.parseDouble(args[i]);
        }
        System.out.print("Sum: " + sum);
    }

}
