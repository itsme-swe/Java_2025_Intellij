package CollectionFramework.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        // Iterating ArrayList using Iterator Interface
        List <Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);

        // Creating Iterator of ArrayList
        Iterator <Integer> iterator = list.iterator();

        // Traversing ArrayList using Iterator
        while (iterator.hasNext()) {
            System.out.println("Elements: " + iterator.next());
        }

    }
}
