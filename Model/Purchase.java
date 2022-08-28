package Model;

import Model.utils.Date;
import java.util.ArrayList;

public class Purchase {
    Date day;
    ArrayList<Product> products = new ArrayList<Product>();

    public Purchase(Date day) {
        setDay(day);
    }

    public Date getDay() {
        return this.day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public Product getProduct(int index) {
        return this.products.get(index);
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public String productsInString() {
        String productsInString = "";

        for (Product product : this.products) {
            productsInString += product.toString() + "\n";
        }

        return productsInString;
    }

    public double getTotalPrice() {
        double totalPrice = 0;

        for (Product product : this.products) {
            totalPrice += product.getPrice();
        }

        return totalPrice;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "day=" + day.toString() +
                ", products=" + productsInString() +
                ", totalPrice=" + getTotalPrice() +
                '}';
    }
}
