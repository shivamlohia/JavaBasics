import java.util.*;
import java.util.Map.Entry;

public class main {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        System.out.println(numbers);
        numbers.put("one", 10); //changes value
        System.out.println(numbers);
        numbers.putIfAbsent("one", 1); //puts only if this pair is absent
        System.out.println(numbers);
        System.out.println(numbers.get("four")); //gets the value of corresponding key
        System.out.println(numbers.containsKey("four")); //returns true or false
        System.out.println(numbers.containsValue(1));  //returns true or false for value
        numbers.replace("one",10,1); //replaces only if old value is same
        System.out.println(numbers);
        System.out.println(numbers.keySet());//returns all keys
        System.out.println(numbers.values());//returns values
        System.out.println(numbers.entrySet());//returns entries
        //Set<Entry<String, Integer>> entries = numbers.entrySet();
        for(Entry<String, Integer> entry : numbers.entrySet())
        {
            entry.setValue(entry.getValue() * 100);
        }
        System.out.println(numbers);
    }
}
