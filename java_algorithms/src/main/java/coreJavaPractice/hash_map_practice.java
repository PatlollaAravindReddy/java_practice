package coreJavaPractice;

import java.util.HashMap;
import java.util.Map;

public class hash_map_practice {
    public static void main(String[] args) {
        String[] data = {"a", "b", "c", "d", "a", "b", "c"};
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i =0; i < data.length; i++) {
            if(hm.containsKey(data[i])) {
                hm.put(data[i], hm.get(data[i]) + 1);
            } else {
                hm.put(data[i], 1);
            }
        }
        for(Map.Entry<String , Integer> me : hm.entrySet()) {
            System.out.println(me.getKey() + " " + me.getValue());
        }
    }
}
