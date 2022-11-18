import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> product;

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public void AddProductInList(Product arg){
        product.add(arg);
    }



    public List<Product> getProductByCost(double cost){
        List<Product> res = new ArrayList<>();
        for (int i = 0; i < product.size(); i++) {
            if (product.get(i).getCost() <= cost) {
                res.add(product.get(i));
            }

        }
        return res;
    }



    public void Printar(){
        System.out.println(product);
    }



}