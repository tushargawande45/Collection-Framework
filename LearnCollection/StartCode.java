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
         names.add("Tushar");
         names.add("Gawande");
         names.add("Patil");
         
         System.out.println(names);
         System.out.println(names.get(0));
         System.out.println(names.get(1));

         //UnTypeSafe Collection
         LinkedList list = new LinkedList();
         
    }
    
}
