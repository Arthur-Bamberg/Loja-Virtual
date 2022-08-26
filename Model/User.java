package Model;

import java.util.List;
public class User {
    String name;
    Double cash;
    List<Purchase> purchases;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCash() {
        return this.cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public Purchase getPurchase(int index) {
        return this.purchases.get(index);
    }

    public void addPurchase(Purchase purchase) {
        this.purchases.add(purchase);
    }
}
