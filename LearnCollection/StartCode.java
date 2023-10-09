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
         names.add("Gawande");
         names.add("Patil");
         names.add("Gawande");
         
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
        names.remove("Gawande");
        //size
        System.out.println("Size = "+names.size());
        //check item is present there or not
        System.out.println(names.contains("Patil"));         
    }
    
}
