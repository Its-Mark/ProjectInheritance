/**
 * CECS 277 Project IPI
 * @author Mark Garcia
 *         mark.garcia01@student.csulb.edu
 * @author Brandon Wiitanen
 *         brandon.wiitanen@student.csulb.edu
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

    /**
  	* @return the total cost of the cart w/ tax
  	*/
    @Override
    public double getCost() {
        return amount * cost;
    }

    /**
     * This method calculates the number of total calories in a given number of Sundae
     * @return result of the amount of Sundae times the calories of each Sundae for the total calorie count
     */
    @Override
    public double getTotalCalories() {
        return amount * calories;
    }

}
