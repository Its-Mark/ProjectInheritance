public abstract class Candy extends DessertItem {
    private int calories;
    private double amount;
    private final double CPP = .89; //cost per pound

    public Candy(){
        super.name = "Candy";
        this.amount = 0;
        this.calories = 0;
    }

    public Candy(String n, int a, int c){
    	super.name = n + "(Candy)";
        this.amount = a;
        this.calories = c;
    }

    @Override
    public double getCost() {
        return amount * CPP;
    }

    public double getTotalCalories() {
        return amount * calories;
    }
}
