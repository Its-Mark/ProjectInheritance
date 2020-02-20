/**
 * CECS 277 Project IPI
 * @author Mark Garcia
 *         mark.garcia01@student.csulb.edu
 * @author Brandon Wiitanen
 *         brandon.wiitanen@student.csulb.edu
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

    /**
     * This method gets the cost of the Cookie in the quantity specified
     * @return result of the number of item times the cost per dozen
     */
    @Override
    public double getCost() {
        return amount * CPD;
    }

    /**
     * This method overrides the toString for the cookie class
     * @return string for the output with cookie information
     */
    @Override
    public String toString(){
        String s = this.amount + " @ " + this.CPD + ".\n" + super.name + "\t\t\t " + getCost();
        return s;
    }

    /**
     * This method calculates the number of total calories in a given number of cookies
     * @return result of the amount of cookies times the calories of each cookie for the total calorie count
     */
    @Override
    public double getTotalCalories() {
        return amount * calories;
    }

}
