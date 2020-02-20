/**
 * CECS 277 Project IPI
 * @author Mark Garcia
 *         mark.garcia01@student.csulb.edu
 * @author Brandon Wiitanen
 *         brandon.wiitanen@student.csulb.edu
 *
 */

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

    /**
  	* @return the total cost of the cart w/ tax
  	*/
    @Override
    public double getCost() {
        return amount * cost;
    }

    /**
     * This method overrides the toString for the IceCream class
     * @return string for the output with IceCream information
     */
    @Override
    public String toString(){
        String s = this.amount + " @ " + this.cost + ".\n" + super.name + "\t\t\t " + getCost();
        return s;
    }

    /**
     * This method calculates the number of total calories in a given number of IceCream
     * @return result of the amount of IceCream times the calories of each IceCream for the total calorie count
     */
    @Override
    public double getTotalCalories() {
        return amount * calories;
    }

}
