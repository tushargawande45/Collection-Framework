package LearnCollection;
import java.util.*;
public class TraverseExample{
    public static void main(String[]args){
        ArrayList<String> names = new ArrayList<>();
        //add
        names.add("Tushar");
        names.add("Krushna");
        names.add("Mahesh");
        names.add("Rohit");

        System.out.println("______________________ForEachLoop__________________________\n");
        //forEach Loop
        for(String str:names){
            StringBuffer str1 = new StringBuffer(str);
            System.out.println(str+"\t\t"+str.length()+"\t\t"+str1.reverse());
        }
        
        System.out.println("______________________Iterator_________________________\n"); 
        //Traverse using Iterator : Forward Traverse
        Iterator<String> itr = names.iterator();
        
        while(itr.hasNext()){
            String next = itr.next();
            System.out.println(next);
        }
        
        System.out.println("________________________ListIterator_______________________\n");
        //Traverse using ListIterator : Backward Traverse
        ListIterator<String> litr = names.listIterator(names.size());

        while(litr.hasPrevious()){
            String previous = litr.previous();
            System.out.println(previous);
        }
        System.out.println("______________________ForEachMathod__________________________\n");
        names.forEach(str->{
            System.out.println(str);
        });
    }
}