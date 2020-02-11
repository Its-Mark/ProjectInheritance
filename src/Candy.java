public abstract class Candy extends DessertItem {
    private int calories;
    private int amount;
    private final double CPP = .89; //cost per pound

    public Candy(int a, int c){
        this.amount = a;
        this.calories = c;
    }

    @Override
    public double getCost() {
        return amount * CPP;
    }

    public int getCalories() {
        return amount * calories;
    }
}
