package VendingApp;

import java.util.ArrayList;
import java.util.List;

//Создать новый продукт на основе Product, создать ему хотя бы одно свойство (например, шоколад и калории) и включить в список продуктов в вендинг машину.
//Продемонстрировать работу класса по продаже товаров (как мы это делали на уроке).
public class Program {
    public static void main(String[] args) {

        Product Bars1 = new Bars ("Милка", "Злаковый батончик [1]", 115, 100, "чёрный" );
        Product Bars2 = new Bars ("Сникерс", "Злаковый батончик [2]", 100, 1.5, "белый");
        Product Bars3 = new Bars ("Марс", "Обычный батончик [3]", 200, 56, "молочный");
        Product Bars4 = new Bars("Баунти", "Злаковый", 100, 59,  "черный");

        List<Product> products = new ArrayList<>();
        products.add(Bars1);
        products.add(Bars2);
        products.add(Bars3);
        products.add(Bars4);

        VendingMachine vendingMachine = new VendingMachine(products);
        Bars barsResult = vendingMachine.getBars(56);
        if (barsResult != null){
            System.out.println("Вы купили: ");
            System.out.println(barsResult.displayInfo());
        }
        else {
            System.out.println("Такого батончика нет в автомате.");
        }
    }
}
