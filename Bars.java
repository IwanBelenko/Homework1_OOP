package VendingApp;

public class Bars  extends Product{
    private double calories; // каллории
    private String chocolate; //шоколад

    public double getCalories() {
        return calories;
    }

    public Bars (String brand, String name, double price, double calories, String chocolate ){
        super(brand, name, price);
        this.calories = calories;
        this.chocolate = chocolate;
    }
    @Override
    public String displayInfo(){
        return String.format("[Батончик]%s -%s - %f- [каллории: %f; шоколад: %s]", brand, name,price, calories,chocolate);

    }
}
