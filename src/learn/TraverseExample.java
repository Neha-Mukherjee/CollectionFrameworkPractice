package learn;

import java.util.*;

import static java.util.Collections.addAll;

public class TraverseExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Jane");
        names.add("Julie");


        //for each loop traversal
        for(String str:names){
            System.out.println(str + "\t" + str.length()+"\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }
        
        //traversing using iterator
        //forward traversing

        Iterator<String> itr = names.iterator();

        while(itr.hasNext()){
            String next =itr.next();

            System.out.println(next);
        }
        System.out.println("______________________");
        //backward traversal of collection --> listiterator
        //need to pass names.size for backward
        ListIterator<String> litr = names.listIterator(names.size());
        while(litr.hasPrevious()){
            String previous =litr.previous();
            System.out.println(previous);
        }

        //for each method
        names.forEach(e->{System.out.println(e);});
        names.forEach(e->{System.out.println(e);});

        //sorting using treeset
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(names);
        treeSet.forEach(e->{System.out.println(e);});

        //enumeration

        Vector<String> vector = new Vector<>();
        Enumeration<String> e = vector.elements();

        vector.addAll(names);
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
