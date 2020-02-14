import java.util.*;
public class Checkout {
	private ArrayList<DessertItem> Cart;
	
	public void clear() {
		
	}
	
	public void enterItem(DessertItem item) {
		
	}
	
	public int numberOfItems() {
		return Cart.size();
	}
	
	public int totalCost(ArrayList<DessertItem> Cart) {
		int priceWOtax = 0;
		for (int i = 0; i < Cart.size(); i++) {
			priceWOtax += DessertItem.getCost(Cart.get(i));
		}
		return priceWOtax;
	}
	
	public int totalTax() {
		
	}
	
	public int getTaxRate() {
		
	}
	
	public void setTaxRate(double taxRate) {
		
	}
	
	
}
