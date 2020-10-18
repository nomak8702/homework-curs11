package bascket;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addFruit("Portocale");
        basket.addFruit("Mar");
        basket.addFruit("Prune");
        basket.addFruit("Lebenita");
        basket.addFruit("Bannane");
        basket.addFruit("Lamaie");

        System.out.println(basket.distinct());

        System.out.println(basket.find("Lamaie"));
        System.out.println(basket.removeFruit("Prune"));

        System.out.println(basket.distinct());
        System.out.println(basket.position("Mar"));
        basket.count();
        System.out.println("----------");
        System.out.println(basket.customCount());
    }
}

