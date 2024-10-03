package anjana;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        
    	// Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements to the HashMap
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        // Retrieving an element
        System.out.println("Value for key 'Apple': " + map.get("Apple"));

        // Checking if a key exists
        if (map.containsKey("Banana")) {
            System.out.println("Map contains key 'Banana'");
        }

        // Checking if a value exists
        if (map.containsValue(30)) {
            System.out.println("Map contains value 30");
        }

        // Iterating over the HashMap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Removing an element
        map.remove("Orange");

        // Checking the size of the HashMap
        System.out.println("Size of HashMap: " + map.size());

        // Clearing the HashMap
        map.clear();

        // Checking if the HashMap is empty
        if (map.isEmpty()) {
            System.out.println("HashMap is empty");
        }
    }
}

