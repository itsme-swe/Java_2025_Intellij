package CollectionFramework.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class sortingArrayList {
    public static void main(String[] args) {

        List <Integer> lst = new ArrayList<>();

        lst.add(5);
        lst.add(20);
        lst.add(2);
        lst.add(10);
        lst.add(12);
        lst.add(5);

        System.out.println("Before sorting: " + lst);    // Before sorting: [5, 20, 2, 10, 12, 5]

        System.out.println();

        Collections.sort(lst);

        System.out.println("After sorting: " + lst);  // After sorting: [2, 5, 5, 10, 12, 20]

        Collections.sort(lst, Collections.reverseOrder());

        System.out.println("Sorting in Descending order: " + lst);  // Sorting in Descending order: [20, 12, 10, 5, 5, 2]


    }
}
