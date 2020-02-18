public class IceCream extends DessertItem {
    private int calories;
    private double amount;
    private double cost;

    public IceCream(){
        super.name = "Ice Cream";
        this.amount = 1.0;
        this.calories = 240;
        this.cost = 8.50;
    }

    public IceCream(String n, double a, int cal, double c) {
        super.name = n + "(Ice Cream)";
        this.amount = a;
        this.calories = cal;
        this.cost = c;
    }

    @Override
    public double getCost() {
        return amount * cost;
    }

    @Override
    public String toString(){
        String s = this.amount + " @ " + this.cost + ".\n" + super.name + "\t\t\t " + getCost();
        return s;
    }

    public double getTotalCalories() {
        return amount * calories;
    }

}
