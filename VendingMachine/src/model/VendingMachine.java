package model;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine extends Object{
    private List<Product> products;

    public  VendingMachine(){
        this(new ArrayList<>());
    }

    private VendingMachine(List<Product> products){
        super();
        this.products = products;
    }

    public List<Product> getProductByCost(double cost){
        List<Product> res = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getCost() <= cost) {
                res.add(products.get(i));
            }

        }
        return res;
    }







}