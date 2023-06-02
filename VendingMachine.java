package VendingApp;

import java.util.List;
public class VendingMachine {
    private List<Product>products;
    public VendingMachine(List<Product>products){
        this.products = products;
    }
    public Bars getBars(double calories) {
        for (Product product : products) {
            if (product instanceof Bars) {
                if (((Bars) product).getCalories() == calories) {
                    return (Bars) product;
                }
            }
        }
        return null;
    }
}
