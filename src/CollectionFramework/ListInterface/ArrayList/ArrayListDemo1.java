package CollectionFramework.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        // Creating ArrayList Object using List Interface ref.
        List <String> lst = new ArrayList<>();

        lst.add("Hello");
        lst.add("World");
        lst.add(1, "This");

        System.out.println(lst);

        lst.add("Of");
        lst.add("Tech");

        System.out.println(lst);

        lst.remove(2);

        System.out.println(lst);

        System.out.println(lst.size());
    }
}
