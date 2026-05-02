package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBasics {
    public static void main(String[] args) {
        //HashMap<String, String> mapping = new HashMap<>();
        Map<String, String> mapping = new HashMap<>();
        //Insertion
        mapping.put("in", "India");
        mapping.put("us", "United States");
        mapping.put("en", "England");
        System.out.println( mapping);


        Map<String, String> table= new HashMap<>();
        table.put("br", "brazil");
        System.out.println("Befor: " + table);
        table.putAll(mapping);
        System.out.println("After: " + table);

        //deletion
        table.remove("en");
        System.out.println(table);

        System.out.println(table.get("br"));
        System.out.println(table.getOrDefault("us", "None"));
        System.out.println(table.getOrDefault("im", "None"));

        System.out.println(table.containsKey("im"));
        System.out.println(table.containsValue("United States"));

        table.replace("in" ,"indonesia");
        System.out.println(table);

        Set<String> keySet = table.keySet();
        System.out.println(keySet);

        Collection<String> valueSet = table.values();
        System.out.println(valueSet);

        // get all the entries from the map
        Set<Map.Entry<String, String>> entrySet = table.entrySet();
        System.out.println("Printing Entries: " + entrySet);
//        table.putIfAbsent("in", "India3");
//        System.out.println(table);// no changes
//        table.putIfAbsent("is", "India");
//        System.out.println(table);// table with new key value
//        System.out.println(table.size());//3
//        table.clear();
//        System.out.println(table.size());//0
    }
}
