public abstract class Cookie extends DessertItem {
    private int calories;
    private int amount;
    private final double CPD = 3.99/12; //cost per dozen

    public Cookie(int a, int c) {
        super.name = "Cookie";
        this.amount = a;
        this.calories = c;
    }

    @Override
    public double getCost() {
        return amount * CPD;
    }

    public int getCalories() {
        return amount * calories;
    }

}
