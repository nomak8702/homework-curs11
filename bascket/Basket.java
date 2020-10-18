package bascket;

import java.util.*;

public class Basket {
    private List<String> fruits = new ArrayList<>();

    public boolean find(String fruit) {

        for (String findFruit : fruits) {
            if (findFruit.equals(fruit)) {
                return true;
            }
        }
        return false;
    }

    public boolean removeFruit(String fruit) {

        for (String removeFruit : fruits) {
            if (removeFruit.equals(fruit)) {
                return true;
            }
        }
        return false;
    }

    public int position(String fruit) {

        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals(fruit)) {
                return i;
            }
        }
        return -1;
    }

    public Collection<String> distinct() {
        List<String> result = new ArrayList<>();
        for (String fruit : fruits) {
            result.add(fruit);
        }
        return result;
    }

    public void addFruit(String fruit) {

        fruits.add(fruit);
    }

    public void count() {
        int count = 0;
        for (String countFruit : fruits) {
            count++;
        }
    }

    public int customCount() {
        int count = 0;
        Iterator<String> countFruits = fruits.iterator();
        while (countFruits.hasNext()) {
            count++;
        }
        return count;
    }
}
