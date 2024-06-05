class Coffee {
    private float coffeeQty;
    private float waterQty;
    private float milkQty;
    private float sugarQty;

    static private Coffee my = null;

    private Coffee() {
        coffeeQty = 1;
        waterQty = 1;
        milkQty = 1;
        sugarQty = 1;

    }

    public void fillWater(float x) {
        waterQty = x;
    }

    public void fillSugar(float x) {
        sugarQty = x;
    }

    public float getCoffee() {
        return 1.23f;

    }

    static Coffee getinstance() {
        if (my == null) {
            my = new Coffee();

        }
        return my;
    }

}

public class singletonOne {
    public static void main(String[] args) {

        Coffee c1 = new Coffee.getinstance();
        Coffee c2 = new Coffee.getinstance();
        Coffee c3 = new Coffee.getinstance();

        System.out.println(c1 + " " + c2 + " " + c3);
        if (c1 == c2 && c1 == c3) {
            System.out.println("Same.");
        }

    }

}
