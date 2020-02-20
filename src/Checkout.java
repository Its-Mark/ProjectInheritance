import java.util.*;

/**
 * CECS 277 Project IPI
 * @author Mark Garcia
 *         mark.garcia01@student.csulb.edu
 * @author Brandon Wiitanen
 *
 */
public class Checkout {
	private ArrayList<DessertItem> Cart;
	private double tax;

	public Checkout() {
		Cart = new ArrayList<>();
	}
	public void sort(){
		Collections.sort(Cart, new Comparator<DessertItem>(){
			public int compare(DessertItem d1, DessertItem d2){
				return d1.compareTo(d2);
			}
		});
	}
	public int size(){
		return Cart.size();
	}
	public DessertItem get(int i){
		return Cart.get(i);
	}
	public void clear() {
		Cart = new ArrayList<>();
	}
	
	public void enterItem(DessertItem item) {
		Cart.add(item);
	}
	
	public String numberOfItems() {
		return "This cart has " + Cart.size() + " items.";
	}
	
	public double cost() {
		double priceWOtax = 0.0;
		for (int i = 0; i < Cart.size(); i++) {
			priceWOtax += Cart.get(i).getCost();
		}
		return priceWOtax;
	}
	
	public double totalCost() {
		return cost() * getTaxRate() + cost();
	}
	
	public double getTaxRate() {
		return tax;
	}
	
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
