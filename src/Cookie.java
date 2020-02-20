/**
 * CECS 277 Project IPI
 * @author Mark Garcia
 *         mark.garcia01@student.csulb.edu
 * @author Brandon Wiitanen
 *
 */
public class Cookie extends DessertItem {
    private int calories;
    private double amount;
    private double CPD;

    public Cookie(){
        super.name = "Cookie";
        this.amount = 0.0;
        this.calories = 0;
        this.CPD = 0;
    }
    public Cookie(String n, double a, int c, double pd) {
        super.name = n + "(Cookie)";
        this.amount = a;
        this.calories = c;
        this.CPD = pd;
    }

    @Override
    public double getCost() {
        return amount * CPD;
    }

    @Override
    public String toString(){
        String s = this.amount + " @ " + this.CPD + ".\n" + super.name + "\t\t\t " + getCost();
        return s;
    }
    @Override
    public double getTotalCalories() {
        return amount * calories;
    }

}
