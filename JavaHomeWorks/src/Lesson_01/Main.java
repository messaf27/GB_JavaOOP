package Lesson_01;
/*
Домашнее задание на закрепление:

1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
3)Создать класс Basket, содержащий массив купленных товаров.
4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
5)Вывести на консоль каталог продуктов. (все продукты магазина)
6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)

Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

Формат сдачи:
Ссылка на гитхаб проект
Подписать фамилию и номер группыпы
* */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("========= Supermarket (stock) =========");

        Category milkFermented = new Category("Milk fermented");
        milkFermented.addCategory(new Product("Milk", 100, 77,10));
        milkFermented.addCategory(new Product("Kefir", 45, 65, 13));
        milkFermented.addCategory(new Product("Ryazhenka", 125, 90, 5));

        Category beer = new Category("Beer");
        beer.addCategory(new Product("Zhigulevskoe", 50, 80, 4));
        beer.addCategory(new Product("Studenoe", 50, 80, 8));
        beer.addCategory(new Product("Amsterdam", 99, 98, 10));

        Category bakery = new Category("Bakery");
        bakery.addCategory(new Product("Rzhanoy", 24, 78, 25));
        bakery.addCategory(new Product("Pshenichnyi", 36, 88, 35));

        System.out.println("========= End  =========");

        ArrayList<Category> supermarketStock = new ArrayList<>();
        supermarketStock.add(milkFermented);
        supermarketStock.add(beer);
        supermarketStock.add(bakery);

        System.out.println("--------- Before shopping --------------");
        for (Category catProd: supermarketStock) {
            System.out.printf("Category: %s \n" +
                    "%s\n", catProd.getName(), catProd);
        }

        User user1 = new User("user1", "qwerty1");
        User user2 = new User("user2", "qwerty2");
        User user3 = new User("user3", "qwerty3");

        System.out.println("--------- User1 --------------");
        user1.takeProduct(bakery.getProduct(2));
        user1.takeProduct(beer.getProduct(3, 3));
        user1.takeProduct(milkFermented.getProduct(1, 4));
        System.out.println(user1);

        System.out.println("--------- User2 --------------");
        user2.takeProduct(bakery.getProduct(2, 2));
        user2.takeProduct(beer.getProduct(1, 2));
        user2.takeProduct(milkFermented.getProduct(2, 1));
        System.out.println(user2);

        System.out.println("--------- User3 --------------");
        user3.takeProduct(bakery.getProduct(1, 1));
        user3.takeProduct(beer.getProduct(2, 5));
        user3.takeProduct(milkFermented.getProduct(1, 2));
        System.out.println(user3);

        System.out.println("--------- After shopping --------------");
        for (Category catProd: supermarketStock) {
            System.out.printf("Category: %s \n" +
                    "%s\n", catProd.getName(), catProd);
        }
    }
}