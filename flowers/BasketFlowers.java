package flowers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BasketFlowers {
    private Set<String> flowers= new HashSet<>();

    public void getAll() {
        Iterator<String> result = flowers.iterator();
        while (result.hasNext()) {
            String name = result.next();
            System.out.print(name+" ");
        }
    }

    public void add(String flower){
        flowers.add(flower);
    }

    public void remove(String flower){
        flowers.remove(flower);
    }


}
