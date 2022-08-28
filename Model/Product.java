package Model;

import Model.utils.Category;

public class Product {
    String name, description;
    Double price;
    Category category;

    public Product(String name, String description, double price, Category category) {
        setName(name);
        setDescription(description);
        setPrice(price);
        setCategory(category);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category=" + category.toString() +
                '}';
    }
}