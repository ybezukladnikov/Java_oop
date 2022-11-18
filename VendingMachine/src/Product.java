public class Product {
    private double cost;
    private String name;
    private TypeProduct typeProduct;

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeProduct(TypeProduct typeProduct) {
        this.typeProduct = typeProduct;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public TypeProduct getTypeProduct() {
        return typeProduct;
    }

    @Override
    public String toString() {
        return String.format("%s %f %s",
                name,
                cost,
                typeProduct);
    }
}
