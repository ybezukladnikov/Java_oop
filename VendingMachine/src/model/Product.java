package model;

public abstract class Product {
    private double cost;
    private String name;
    private TypeProduct typeProduct;

    public Product(double cost, String name) {
        this.cost = cost;
        this.name = name;

    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }



    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return String.format("%s %f рублей",
                name,
                cost);
    }
}
