package flowers;

public class Main {
    public static void main(String[] args) {
        BasketFlowers basketFlowers = new BasketFlowers();
        basketFlowers.add("Trandafir");
        basketFlowers.add("Gerbera");
        basketFlowers.add("Amaryllis");
        basketFlowers.add("Magnolia");
        basketFlowers.add("Narcisele");
        basketFlowers.add("Amaryllis");

        basketFlowers.getAll();
        basketFlowers.remove("Magnolia");
        System.out.println();
        basketFlowers.getAll();

    }
}
