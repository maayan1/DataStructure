package LeetCode.HashTable;

import java.util.HashMap;

public class hash_map_demo {

    public static void main(String[] args)
    {

        // Creating an empty HashMap
        HashMap<String, Integer> hash_map = new HashMap<String, Integer>();

        // Mapping int values to string keys
        hash_map.put("Geeks", 10);
        hash_map.put("4", 15);
        hash_map.put("Geeks", 20);
        hash_map.put("Welcomes", 25);
        hash_map.put("You", 30);

        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + hash_map);

        // Checking for the Value '10'
        System.out.println("Is the value '10' present? " +
                hash_map.containsValue(10));

        // Checking for the Value '30'
        System.out.println("Is the value '30' present? " +
                hash_map.containsValue(30));

        // Checking for the Value '40'
        System.out.println("Is the value '40' present? " +
                hash_map.containsValue(40));
    }
}

