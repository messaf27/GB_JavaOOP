package Lesson_01;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> products = new ArrayList<>();
    public Basket() {
    }

    @Override
    public String toString(){
        int index = 0;
        StringBuilder out = new StringBuilder();
        for (Product product: this.products) {
            index++;
            out.append(String.format("[%d] ", index) + product.toString() + "\n");
        }
        return  out.toString();
    }

    public void addProduct(Product p) {
        this.products.add(p);
    }


}
