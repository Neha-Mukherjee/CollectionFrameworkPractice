package learn;
import java.util.*;

public class StartCode {

    public static void main(String[] args) {
        System.out.println("Welcome to collections framework");


        /*creating collection

        1-type safe - same type of elements(objects ) are added to the collection
        2-un type safe-different types of elements can be added to collection
         */

        //type safe collection
        ArrayList<String> names = new ArrayList<String>();
                names.add("John");
                names.add("Jane");
                names.add("Julie");
                System.out.println(names);
                System.out.println(names.get(0));

//
//                //untype safe
//        LinkedList list = new LinkedList();
//        list.add("John");
//        list.add("101");
//        list.add(24355);
//        list.add(true);
//        System.out.println(list);

        //remove
        names.remove("John");
        System.out.println(names);

        //size
        System.out.println("Size="+names.size());

        //if an item is present or not
        //calls type's equal method call to check

        System.out.println(names.contains("Jane"));

        //check for empty
        System.out.println(names.isEmpty());

        //setting value
        //names.set(1, "John");
        names.add("john");
        System.out.println(names);

        //remove all elements
//        names.clear();
        System.out.println(names);

        //vector
        Vector<String> vector = new Vector<>();
        vector.addAll(names);
        System.out.println(vector);


        System.out.println("____________________________________________________");


        //hashset
        HashSet<Double> nms = new HashSet<>();
        nms.add(11111.0);
        nms.add(2.0);
        nms.add(33353535.463);
        nms.add(4444.555);
        nms.add(4444.555);

        System.out.println(nms);

        //treeset

        TreeSet<Double> tset = new TreeSet<>();
        tset.addAll(nms);
        System.out.println(tset);

    }
}
