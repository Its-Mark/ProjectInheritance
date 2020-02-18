public abstract class Cookie extends DessertItem {
    private int calories;
    private double amount;
    private final double CPD = 3.99/12; //cost per dozen

    public Cookie(){
        super.name = "Cookie";
        this.amount = 0.0;
        this.calories = 0;
    }

    public Cookie(String n, int a, int c) {
        super.name = n + "(Cookie)";
        this.amount = a;
        this.calories = c;
    }

    @Override
    public double getCost() {
        return amount * CPD;
    }

    public double getTotalCalories() {
        return amount * calories;
    }

}
