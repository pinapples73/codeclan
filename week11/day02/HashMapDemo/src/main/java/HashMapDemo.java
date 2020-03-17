import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String, String> favouriteFruits = new HashMap<String, String>();

        favouriteFruits.put("Alice", "Apple");
        favouriteFruits.put("Sarah", "Banana");
        favouriteFruits.put("Bob", "Strawberry");

        //add to hash
        favouriteFruits.put("Niall", "Kiwi");
        // get from hash
        String niallsFruit = favouriteFruits.get("Niall");
        //get size of hash
        int fruitsSize = favouriteFruits.size();
        //clear hash
        favouriteFruits.clear();
        //does the hashmap contain a given value?
        boolean hasKiwi = favouriteFruits.containsValue("Kiwi");  // returns true
        //does the hashmap contain a given key?
        boolean hasGus = favouriteFruits.containsKey("Gus");  //returns false
        //remove a key value pair from hashmap
        favouriteFruits.remove("Niall");



        System.out.println(favouriteFruits.get("Sarah"));

    }
}
