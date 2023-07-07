package Lesson_01;

public class User {
    private String login;
    private String password;
    private Basket basket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }

    public void takeProduct(Product p)
    {
        this.basket.addProduct(p);
    }

    @Override
    public String toString(){
        return this.basket.toString();
    }
}
