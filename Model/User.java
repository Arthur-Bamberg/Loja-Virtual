package Model;

import java.util.ArrayList;
public class User {
    String name;
    Double cash;
    ArrayList<Purchase> purchases = new ArrayList<Purchase>();

    public User(String name, Double cash) {
        setName(name);
        setCash(cash);
    }

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

    public String purchasesInString() {
        String purchasesInString = "";

        for (Purchase purchase : this.purchases) {
            purchasesInString += purchase.toString() + "\n";
        }

        return purchasesInString;
    }

    public double cashAfterPayments() {
        double cashAfterPayments = this.cash;

        for (Purchase purchase : this.purchases) {
            cashAfterPayments -= purchase.getTotalPrice();
        }

        return cashAfterPayments;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", cash=" + cash +
                ", purchases=" + purchasesInString() +
                ", cashAfterPayments=" + cashAfterPayments() +
                '}';
    }
}
