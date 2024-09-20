  import java.util.*;

public  class ImpemetnationofHashmap {

    //O(1) PUT(), 
    //get(),
    // containsKey(), 
    //remove(),
    // size(),
    // keySet()
//hashing refers to the change in the form of the data supose "abc" sortred as "123" 
//hashing is done using various algorithms 
//used for the storing of the psswords

static class HashMap<K,V>{
    private class Node{
        K key;
        V value;
    
  

    public Node (K key, V value){
        this.key=key;
        this.value= value;
    }
}
private int n;
private int N;

private LinkedList<Node> buckets[] ;//hashmap

@SuppressWarnings("unchecked")
public HashMap(){
    this.N=4;
    this.buckets = new LinkedList[4];
    for(int i=0;i<4;i++){
        this.buckets[i] = new LinkedList<>();
    }
}
private int hashFunction(K key){// 0 to N-1
   int bi = key.hashCode();
  return  Math.abs(bi) % N;


}
private int searchInLL(K key, int bi){
    LinkedList<Node> ll = buckets[bi];
    int di =0;
    for(int i =0;i<ll.size();i++){
        if(ll.get(i).key == key){
            return i;
        }
    }
    return -1;
}

public void rehash(){
    LinkedList<Node> oldBucket[] = buckets;
    buckets = new LinkedList[N*2];

    for(int i =0;i<N*2;i++){
        buckets[i] = new LinkedList<>();


    }
    for(int i =0;i<oldBucket.length;i++){
        LinkedList<Node> ll = oldBucket[i];
        for(int j = 0;j<ll.size(); j++){
            Node node = ll.get(j);
            put(node.key, node.value);
        
        }
    }

}
public void put(K key, V value){
    int bi=hashFunction(key);
    int di=searchInLL(key, bi);//di = -1
    if(di == -1){
        buckets[bi].add(new Node(key,value));
        n++;
    }
    else{
        //key exists
        Node data = buckets[bi] .get(di);
        data.value=value;

    }
    double lambda =(double)n/N;
    if(lambda>2.0){
        //rehashing
        rehash();//creae an array that is of the double size 




    }

}
public boolean containsKey(K key){

    //check if key exista or not
    int bi = hashFunction(key);
    int di = searchInLL(key, bi);

    if(di == -1){
        return false;

    }
    else{
        return true;
    }
}
public V remove (K key){
    //case 1 if key exists remove it
    //case 2 not exists then return null;

    int bi = hashFunction(key);
    int di = searchInLL(key, bi);
    if(di == -1){
        return null;
    }
    else{
        Node node = buckets[bi].remove(di);
        n--;
        return node.value;
    }
 

}

public ArrayList<K> keySet(){
    ArrayList<K> keys = new ArrayList<>();
    for(int i =0;i<buckets.length;i++){
        LinkedList<Node> ll = buckets[i];

        for(int j = 0;j<ll.size();j++){
            Node node = ll.get(j);
            keys.add(node.key);
        }
    }
    return keys;
}

public boolean isEmpty(){

    return n== 0;
}
public V get(K key){
    int bi=hashFunction(key);
    int di = searchInLL(key, bi);

    if(di==-1){
    return null;
    }
    else{
        Node node = buckets[bi].get(di);
        return node.value;

    }
    
}


}

    public static void main(String[] args) {

                    
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 300);
        map.put("China", 200);
        map.put("USA", 700);
//we did this to get all the keys
        ArrayList<String> keys = map.keySet();
        for(int i =0;i<keys.size();i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }
        //try to explore all the functions built by us
        // we got the warning in the code because in rehash function we have not shown the type of hashmap
        
        
         
    }      
}                                  
