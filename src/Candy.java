public class Candy extends DessertItem {
    private int calories;
    private double amount;
    private double CPP;

    public Candy(){
        super.name = "Candy";
        this.amount = 0;
        this.calories = 0;
        this.CPP = 0;
    }

    public Candy(String n, double a, int cal, double c){
    	super.name = n + "(Candy)";
        this.amount = a;
        this.calories = cal;
        this.CPP = c;
    }

    @Override
    public double getCost() {
        return amount * CPP;
    }

    @Override
    public String toString(){
        String s = this.amount + " @ " + this.CPP + ".\n" + super.name + "\t\t\t " + getCost();
        return s;
    }

    @Override
    public double getTotalCalories() {
        return amount * calories;
    }
}
