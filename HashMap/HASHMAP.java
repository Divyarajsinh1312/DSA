package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class HASHMAP {
    public static void main(String[] args) {
        HashMap <Integer, ArrayList<Integer>> hash = new HashMap<>();
        
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        hash.put(1, list1);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        hash.put(2, list2);
        
        for (HashMap.Entry<Integer, ArrayList<Integer>> e : hash.entrySet()) {
            System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
        }

        System.out.println(hash.get(2));
        if (!hash.containsKey(3)) {
            System.out.println("Hash don't contain key 3");
        }
    }
}
