package VendingApp;

public class Product {
    protected String name;
    protected String brand;
    protected double price;



    public Product(String brand, String name, double price){
        checkPrice(price);
        if (name.length() < 5){
            this.name = "product";
        }
        else {
            this.name = name;
        }
        this.brand = brand;


    }

    private void checkPrice(double inputPrice){
        if (inputPrice <= 0){
            price = 100;
        }
        else {
            price = inputPrice;
        }
    }

    public String displayInfo(){
        return String.format("%s - %s- %f", brand, name, price);
    }
}
