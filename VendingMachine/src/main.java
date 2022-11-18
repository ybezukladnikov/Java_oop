import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Product good1 = new Product();
        good1.setCost(34.3);
        good1.setName("dsfsdf");
        good1.setTypeProduct(TypeProduct.Chocolate);

        Product good2 = new Product();
        good2.setCost(60.3);
        good2.setName("sdfdsf");
        good2.setTypeProduct(TypeProduct.Chocolate);

//        System.out.println(good1.toString());
        VendingMachine test = new VendingMachine();

        List<Product> testarr = new ArrayList<>();
        test.setProduct(testarr);
        test.AddProductInList(good1);
        test.AddProductInList(good2);


        test.Printar();

        System.out.println(test.getProductByCost(50));




    }




}
