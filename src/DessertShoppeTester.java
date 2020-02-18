import java.util.ArrayList;

public class DessertShoppeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checkout test = new Checkout();
		Cookie c1 = new Cookie("Chocolate Chip", 12.0, 50, 3.99);
		Cookie c2 = new Cookie("Oatmeal", 24.0, 25, 2.99);
		Candy c3 = new Candy("Corn", 30.0, 10, .10);
		Candy c4 = new Candy("CandyCane", 3, 35,1.0);
		IceCream i1 = new IceCream("Vanilla", 1.0, 400, 6.99);
		IceCream i2 = new IceCream("Chocolate", 1.0, 500, 7.99);
		IceCream i3 = new Sundae(1.0, 600, 10.0);
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
		System.out.println("Call Clear");
		test.clear();
		System.out.println("if zero cart is empty:" + test.numberOfItems());

	}

}
