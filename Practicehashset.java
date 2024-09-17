import java.util.HashSet;
import java.util.Iterator;
public class Practicehashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(2);
        set.add(1);
        System.out.println(set);
        
        //search-contains

        if(set.contains(2)){
            System.out.println("Contains");

        }
        else{
            System.out.println("Not Contains");
        }
        if(!set.contains(1)){
            System.out.println("Set has no 1");

        }
        else{
            System.out.println("Contians");
        }

        set.remove(1);
        if(set.contains(1)){
            System.out.println(" Contains 1");

        }
        else{
          System.out.println("Notcotains 1");
        }
        //siz of the set
        System.out.println("Size of the set is " +set.size());
//print all the lements of the set
        System.out.println(set);
        //iterator-> used to iterate over the set
        Iterator it = set.iterator();
      // System.out.println(it.next()); 
// it dies not guarentees the order of the set//zaruri 
            //nahi hai k jis order me daal rhe hai usi order me bahar aayein elements
            while(it.hasNext()){
            System.out.println(it.next());

        }
        
    }

    
}
