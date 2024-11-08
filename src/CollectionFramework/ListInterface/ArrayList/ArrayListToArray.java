package CollectionFramework.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ArrayListToArray {
    public static void main(String[] args) {

        List <Integer> lst = new ArrayList<>();

        lst.add(10);
        lst.add(20);
        lst.add(15);
        lst.add(12);
        lst.add(20);
        lst.add(30);

        Iterator <Integer> itr = lst.iterator();

        while (itr.hasNext()) {
            System.out.println("Elements: " + itr.next());
        }

        // Here we are converting ArrayList to an Array
        Object[] arr = lst.toArray();

        for (Object obj : arr){
            System.out.println("Array: " + obj);
        }
    }
}
