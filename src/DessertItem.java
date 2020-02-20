import java.util.ArrayList;

public abstract class DessertItem {

    protected String name;

    /**
     * Null constructor for DessertItem class
     */
    public DessertItem() {
        this("");
    }
    /**
     * Initializes DessertItem data
     */
    public DessertItem(String name) {
        this.name = name;
    }
    /**
     * Returns name of DessertItem
     * @return name of DessertItem
     */
    public final String getName() {
        return name;
    }
    /**
     * Returns cost of DessertItem
     * @return cost of DessertItem
     */
    public abstract double getCost();
    public abstract double getTotalCalories();

    public int compareTo(DessertItem d2){
        int outcome;
        if(this.getTotalCalories() > d2.getTotalCalories())
            outcome = 1;
        else if(this.getTotalCalories() < d2.getTotalCalories())
            outcome = -1;
        else
            outcome = 0;
        return outcome;
    }

    public static DessertItem max(Checkout a){
        DessertItem largest = a.get(0);
        int comparison;
        for (int i = 1; i < a.size(); i++){
            comparison = largest.compareTo(a.get(i));
            if (comparison == -1)
                largest = a.get(i);
        }
        return largest;
    }
}