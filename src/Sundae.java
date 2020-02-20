/**
 * CECS 277 Project IPI
 * @author Mark Garcia
 *         mark.garcia01@student.csulb.edu
 * @author Brandon Wiitanen
 *
 */
public class Sundae extends IceCream {
    private int calories;
    private double amount;
    private double cost;


    public Sundae(String s,double a, int cal, double c) {
        super.name = s+ "(Sundae)";
        this.amount = a;
        this.calories = cal;
        this.cost = c;
    }

    @Override
    public double getCost() {
        return amount * cost;
    }

    @Override
    public double getTotalCalories() {
        return amount * calories;
    }

}
