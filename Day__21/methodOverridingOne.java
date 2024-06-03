class TV {

    public void switchOn() {
        System.out.println("Switch ON using button.");
    }

    public void changeChannel() {
        System.out.println("Channel Changed using button.");
    }
}

class STV extends TV {

    public void switchOn() {
        System.out.println("Switch ON using remote.");
    }

    public void changeChannel() {
        System.out.println("Channel Changed using remote.");
    }

    public void browse() {
        System.out.println("Smart TV Browsing.");
    }
}

public class methodOverridingOne {
    public static void main(String[] args) {

        TV t = new TV();
        t.switchOn();
        t.changeChannel();

        STV s = new STV();
        s.switchOn();
        s.changeChannel();
        s.browse();

        TV t1 = new STV();
        t1.switchOn();
        t1.changeChannel();

    }

}
