
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Print the HashSet
        System.out.println("HashSet: " + hashSet);

        // Check if an element exists in the HashSet
        boolean containsApple = hashSet.contains("Apple");
        System.out.println("Contains Apple: " + containsApple);

        // Remove an element from the HashSet
        hashSet.remove("Banana");

        // Print the updated HashSet
        System.out.println("Updated HashSet: " + hashSet);

        // Get the size of the HashSet
        int size = hashSet.size();
        System.out.println("Size of HashSet: " + size);

        // Clear the HashSet
        hashSet.clear();

        // Check if the HashSet is empty
        boolean isEmpty = hashSet.isEmpty();
        System.out.println("Is HashSet empty? " + isEmpty);
    }
}


