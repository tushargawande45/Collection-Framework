package LearnCollection;
//import util Package[All Classes]
import java.util.*;

public class StartCode {
    public static void main(String args[]){
        System.out.println("Welcome to code java collection framework");

        /*
        Creating Collection
        1)Type Safe : Same Type of elements(objects) are added collection
        2)Un-Type Safe : different types of elements can be added to collection 
         */

         //TypeSafe Collection
         ArrayList<String> names = new ArrayList<>();
         //add
         names.add("Tushar");
         names.add("Rameshwar");
         names.add("Mahesh");
         names.add("Rohit");
         
         System.out.println(names);
        //  System.out.println(names.get(0));
        //  System.out.println(names.get(1));

        //  //UnTypeSafe Collection
        //  LinkedList list = new LinkedList();
        //  list.add("Sachin");
        //  list.add(100);
        //  list.add(302.665);
        //  list.add(true);

        //  System.out.println(list);
       
        //delete
        //names.remove("Rameshwar");

        //size
        //System.out.println("Size = "+names.size());

        //check item is present there or not
        //System.out.println(names.contains("Mahesh"));

        //check for empty
        //System.out.println(names.isEmpty());
        
        //setting value
        //names.set(1, "Ramesh");

        //System.out.println(names);

        Vector<String> vector = new Vector<>();
        vector.addAll(names);
        System.out.println("VECTOR = "+vector);

        System.out.println("_______________________________________________________________");

        HashSet<Double> nms = new HashSet<>();
        nms.add(14.14);
        nms.add(34.12354);
        nms.add(2354.235);
        nms.add(99.3);
        nms.add(99.3);
        nms.add(5.3);

        System.out.println(nms);

        TreeSet<Double> tset= new TreeSet<>();
        tset.addAll(nms);
        System.out.println(tset);


    }
    
}
