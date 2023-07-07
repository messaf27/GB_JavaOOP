package Lesson_01;

import java.util.ArrayList;

public class Category {
    private ArrayList <Product> products = new ArrayList<>();
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public void addCategory(Product product){
        this.products.add(product);
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
    public Product getProduct(int index) {
        this.products.get(index - 1).buy();
        return  new Product(
                this.products.get(index - 1).getName(),
                this.products.get(index - 1).getPrice(),
                this.products.get(index - 1).getRating(),
                1
        );
    }
    public Product getProduct(int index, Integer quantity) {
        this.products.get(index - 1).buy(quantity);
        return  new Product(
                this.products.get(index - 1).getName(),
                this.products.get(index - 1).getPrice(),
                this.products.get(index - 1).getRating(),
                quantity
        );
    }

    public String getName() {
        return name;
    }
}
