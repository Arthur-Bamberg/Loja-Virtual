import java.util.ArrayList;

import Model.Product;
import Model.Purchase;
import Model.User;
import Model.utils.Category;
import Model.utils.Date;

public class Test {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
        ArrayList<Purchase> purchases = new ArrayList<Purchase>();
        ArrayList<User> users  = new ArrayList<User>();

        products.add(new Product("Product 1", "Description 1", 10.0, new Category("Category 1", "Description 1")));
        products.add(new Product("Product 2", "Description 2", 20.0, new Category("Category 2", "Description 2")));

        purchases.add(new Purchase(new Date(1, 1, 2018)));
        purchases.get(0).addProduct(products.get(0));

        purchases.add(new Purchase(new Date(2, 2, 2022)));
        purchases.get(1).addProduct(products.get(1));

        users.add(new User("User 1", 100.0));
        users.get(0).addPurchase(purchases.get(0));

        users.add(new User("User 2", 200.0));
        users.get(1).addPurchase(purchases.get(1));

        System.out.println(users.get(0).toString());
        System.out.println(users.get(1).toString());
    }
}
