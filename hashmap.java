//hashmaps are used whereever we need to store the data in key value pair form
//key -value
 //rollno-name
 //in hashmaps key is always unique 
 //but 
 //value can be unique also and same also

 import java.util.HashMap;
 import java.util.Iterator;
import java.util.*;

 public class hashmap{
    public static void main(String[] args) {
        //country(key), population(value)
        HashMap<String, Integer> map= new HashMap<>();
       //put() -> to add
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);
        map.put("Nepal", 200);
        //HashMaps do not work in ordered form 
        System.out.println(map);

        //if we reinsert the same key with other value then values get change
        // map.put-> value exits(update value)
        // map.put-> value doesnt exists (new value gets added)
        map.put("China", 80);
        System.out.println(map);

        //Search
        if(map.containsKey("Bali")){
            System.out.println("Key is present in the map");

        }
        else{
            System.out.println("Key is not present in the map");

        }

        //key exist then get value
        System.out.println(map.get("China"));
        //key diesnt exists then gives null
        System.out.println(map.get("Indonesia"));

        // So all together we can say that containskey and get are valid for lookup


        //ON ARRAYS
        int[]arr={12,15,17};
        for(int i=0;i<3;i++){
            System.out.println(arr[i]);
            
        }
        System.out.println();
        for(int val:arr){
            System.out.println(val+" ");
        }
//ek treeka
        for(Map.Entry<String, Integer>  e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
//dusra tareeka
        Set<String> keys =map.keySet();
        for(String key:keys){
            System.out.println(key +" " + map.get(key));

        }
        //to remove a pair
        map.remove("China");
        System.out.println(map);

    }
 }
