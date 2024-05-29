public class sortingArrayOfStrings {
    public static void main(String[] args) {
        String arr[] = { "Harsh", "Java", "Chandu", "Ishaan", "Steve", "Khushi", "Kaushal", "Upadhyay" };
        java.util.Arrays.sort(arr);

        System.out.print("Sorted Array: {");
        for (String x : arr) {
            System.out.print(x + " , ");
        }
        System.out.println("}");
    }

}
