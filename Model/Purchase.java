package Model;

import Model.utils.Date;
import java.util.List;
public class Purchase {
    Date day;
    List<Product> products;


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

    public String productsInString() {//Shold be fixed
        String productsInString = "";
        for (Product product : this.products) {
            productsInString += product.toString() + "\n";
        }
        return productsInString;
    }
}
