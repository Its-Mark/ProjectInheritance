import java.util.*;

/**
 * CECS 277 Project IPI
 * @author Mark Garcia
 *         mark.garcia01@student.csulb.edu
 * @author Brandon Wiitanen
 *				brandon.wiitanen@student.csulb.edu
 *
 */
public class Checkout {
	private ArrayList<DessertItem> Cart;
	private double tax;

	/**
	* this constructor creates an empty arraylist of dessert
	*/
	public Checkout() {
		Cart = new ArrayList<>();
	}
	/**
	*this method uses the sort method in the collections package to sort the items by the amount of calories
	*/
	public void sort(){
		Collections.sort(Cart, new Comparator<DessertItem>(){
			public int compare(DessertItem d1, DessertItem d2){
				return d1.compareTo(d2);
			}
		});
	}
	/**
	* @return the size of the Cart
	*/
	public int size(){
		return Cart.size();
	}
	/**
	* @return the desert item at index i
	*/
	public DessertItem get(int i){
		return Cart.get(i);
	}
	/**
	*clears the cart of items
	*/
	public void clear() {
		Cart = new ArrayList<>();
	}
	/**
	*adds an item to the Cart
	*/
	public void enterItem(DessertItem item) {
		Cart.add(item);
	}
	/**
	* @return	a string that says how many items the cart has
	*/
	public String numberOfItems() {
		return "This cart has " + Cart.size() + " items.";
	}
	/**
	* @return the total cost of the cart w/0 tax
	*/
	public double cost() {
		double priceWOtax = 0.0;
		for (int i = 0; i < Cart.size(); i++) {
			priceWOtax += Cart.get(i).getCost();
		}
		return priceWOtax;
	}

	/**
	* @return the total cost of the cart w/ tax
	*/
	public double totalCost() {
		return cost() * getTaxRate() + cost();
	}
	/**
	* @return the tax to be charged
	*/
	public double getTaxRate() {
		return tax;
	}
	/**
	* sets the tax rate for the items
	*/
	public void setTaxRate(double taxRate) {
		this.tax = taxRate;
	}

	public String toString(){
		String s = "";
		for (DessertItem t : Cart){
			s += t.toString() + "\n------------------------------------------------------------------------------------------------------\n";
		}
		return s;
	}

}
