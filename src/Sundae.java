public abstract class Sundae extends IceCream {
    private int calories;
    private int amount;
    private double cost;


    public Sundae(int a, int cal, int c) {
        super.name = "Sundae";
        this.amount = a;
        this.calories = cal;
        this.cost = c;
    }

    @Override
    public double getCost() {
        return amount * cost;
    }

    public int getCalories() {
        return amount * calories;
    }

}
