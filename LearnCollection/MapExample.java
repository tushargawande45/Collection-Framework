package LearnCollection;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> cources = new HashMap<>();
        //adding elements
        cources.put("Core Java", 4000);
        cources.put("Basic python", 3500);
        cources.put("Spring", 8000);
        cources.put("Android", 4000);
        cources.put("Android", 4000);
        cources.put("PHP", 2414);

        System.out.println(cources);
        
        cources.forEach((e1,e2)->{
            System.out.println(e1+"=>"+e2);
        });

        System.out.println(cources.get("Core Java"));

        

    }
    
}
