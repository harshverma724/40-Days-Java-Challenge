enum Dept {

    CS("Harsh", "Block A"), IT("Chandu", "Block B"), CIVIL("Ishaan", "Block C"), ESE("Pankaj", "Block D");

    private String head;
    public String location;

    private Dept(String head, String location) {
        this.head = head;
        this.location = location;

    }

    public String getHeadName() {
        return head;

    }

    public String getLocation() {
        return location;

    }

}

public class enumDemo {
    public static void main(String[] args) {

        Dept d = Dept.CS;
        System.out.println(d.getHeadName());
        System.out.println(d.getLocation());

        /*
         * // Array of Dept
         * Dept list[] = Dept.values();
         * 
         * for (Dept x : list) {
         * System.out.println(x);
         * }
         * System.out.println();
         * System.out.println(Dept.valueOf("CS"));
         * System.out.println();
         * 
         * switch (d) {
         * case CS:
         * System.out.println("Head: Harsh");
         * break;
         * 
         * case IT:
         * System.out.println("Head: Chandu");
         * break;
         * 
         * case CIVIL:
         * System.out.println("Head: Ishaan");
         * break;
         * 
         * case ESE:
         * System.out.println("Head: Pankaj");
         * break;
         * 
         * }
         */

    }

}
