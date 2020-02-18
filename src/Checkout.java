import java.util.*;
public class Checkout {
	private ArrayList<DessertItem> Cart;
	private double tax;
	
	public void clear() {
		Cart = new ArrayList<>();
	}
	
	public void enterItem(DessertItem item) {
		Cart.add(item);
	}
	
	public int numberOfItems() {
		return Cart.size();
	}
	
	public double cost(ArrayList<DessertItem> Cart) {
		double priceWOtax = 0.0;
		for (int i = 0; i < Cart.size(); i++) {
			priceWOtax += Cart.get(i).getCost();
		}
		return priceWOtax;
	}
	
	public double totalCost() {
		return cost(this.Cart) * getTaxRate();
	}
	
	public double getTaxRate() {
		return tax;
	}
	
	public void setTaxRate(double taxRate) {
		this.tax = taxRate;
	}
	
	
}
