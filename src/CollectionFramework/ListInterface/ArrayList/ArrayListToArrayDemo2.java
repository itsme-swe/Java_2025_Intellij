package CollectionFramework.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListToArrayDemo2 {
    public static void main(String[] args) {

        List<String> name = new ArrayList<>();

        name.add("Harsh");
        name.add("Mukul");
        name.add("Sahu");
        name.add("Harsh");
        name.add("Adam");



        String[] str = name.toArray(new String[0]);

        for (String ele : str) {
            System.out.println(ele);
        }

        System.out.println(name.contains("Sahu"));  // true

        System.out.println(name.indexOf("Harsh"));  // Returning first occurrence of element is 0

        System.out.println(name.lastIndexOf("Harsh"));  // Returning last occurrence of element is 3

        System.out.println(name.get(4));    // Return an element present at index value

        System.out.println(name.set(3,"Juhu")); // set() method will replace the element present at the passed index_value

        System.out.println(name);   // [Harsh, Mukul, Sahu, Juhu, Adam]



    }
}
