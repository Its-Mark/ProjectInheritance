import java.util.*;
public class Checkout {
	private ArrayList<DessertItem> Cart;
	private double tax;

	public Checkout(){
		Cart = new ArrayList<>();
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
