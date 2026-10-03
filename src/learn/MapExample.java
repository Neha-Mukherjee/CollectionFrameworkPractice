package learn;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args){

        HashMap<String,Integer> courses = new HashMap<>();
        //adding element
        courses.put("A",1);
        courses.put("B",2);
        courses.put("C",3);
        courses.put("D",4);

        System.out.println(courses);
//
//        courses.forEach((e1,e2)->{
//            System.out.println(e1 + "=>"+e2);
//        });
        courses.forEach((key,value)->{
            System.out.println(key);
            System.out.println("=>");
            System.out.println(value);
            System.out.println();
        });


        System.out.println(courses.get("A"));
    }
}
