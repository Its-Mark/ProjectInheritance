/**
 * CECS 277 Project IPI
 * @author Mark Garcia
 *         mark.garcia01@student.csulb.edu
 * @author Brandon Wiitanen
 *         brandon.wiitanen@student.csulb.edu
 *
 */
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

    /**
     * This method gets the cost of the Candy in the quantity specified
     * @return result of the number of item times the cost per dozen
     */
    @Override
    public double getCost() {
        return amount * CPP;
    }

    /**
     * This method overrides the toString for the Candy class
     * @return string for the output with Candy information
     */
    @Override
    public String toString(){
        String s = this.amount + " @ " + this.CPP + ".\n" + super.name + "\t\t\t " + getCost();
        return s;
    }

    /**
     * This method calculates the number of total calories in a given number of Candies
     * @return result of the amount of CAndy times the calories of each Candy for the total calorie count
     */
    @Override
    public double getTotalCalories() {
        return amount * calories;
    }
}
