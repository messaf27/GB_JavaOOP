package Lesson_01;

public class Product {
    private String name;
    private Integer price;
    private Integer rating;
    private Integer balance;

    public Product() {
    }

    public Product(String name, Integer price, Integer rating, Integer balance) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getRating() {
        return rating;
    }

    public void buy() {
        if(this.balance > 0)
            this.balance--;
        else
            System.out.printf("Out of stock requested quantity!!! (quantity in stock: %d)", this.balance);
    }

    public void buy(Integer quantity) {
        if(this.balance >= quantity)
            this.balance -= quantity;
        else
            System.out.printf("Out of stock requested quantity!!! (quantity in stock: %d)", this.balance);
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getBalance() {
        return balance;
    }

    @Override
    public String toString(){
        return String.format(
                "Product: %s; " +
                "Price: %d; " +
                "Rating: %d; " +
                "Balance: %d",
                this.name,
                this.price,
                this.rating,
                this.balance);
    }
}
