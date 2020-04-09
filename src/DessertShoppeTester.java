import javax.crypto.spec.DESedeKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * CECS 277 Project IPI
 * @author Mark Garcia
 *         mark.garcia01@student.csulb.edu
 * @author Brandon Wiitanen
 *
 */

public class DessertShoppeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checkout test = new Checkout();
		DessertItem c1 = new Cookie("Chocolate Chip", 12.0, 50, 3.99);
		DessertItem c2 = new Cookie("Oatmeal", 24.0, 20, 2.99);
		DessertItem c3 = new Candy("Corn", 30.0, 10, .10);
		DessertItem c4 = new Candy("CandyCane", 3, 35,1.0);
		DessertItem i1 = new IceCream("Vanilla", 1.0, 400, 6.99);
		DessertItem i2 = new IceCream("Chocolate", 1.0, 500, 7.99);
		DessertItem i3 = new Sundae("Caramel",1.0, 650, 10.0);
		test.enterItem(c1);
		test.enterItem(c2);
		test.enterItem(c3);
		test.enterItem(c4);
		test.enterItem(i1);
		test.enterItem(i2);
		test.enterItem(i3);
		test.setTaxRate(.1025);
		System.out.println(test.numberOfItems() + "items: ");
		System.out.println(test);
		System.out.println("The cost of the cart without tax is: $" + String.format("%.2f", test.cost()));
		System.out.println("The cost of the car with tax is: $" + String.format("%.2f",test.totalCost()));
		System.out.println("The max is: ");
		DessertItem largest = DessertItem.max(test);
		double lcal = largest.getTotalCalories();
		System.out.println(largest + "\nwith " + lcal + " calories.\nSorting list....");
		test.sort();
		System.out.println(test);
		System.out.println("Call Clear");
		test.clear();
		System.out.println("Printing number of items. If zero cart is empty: " + test.numberOfItems());

	}

}
