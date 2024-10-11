package leetCode;

import java.util.*;

public class GroupAnagrams_49 {
    public static void main(String[] args) {
        String[] data = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(data));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs == null || strs.length == 0) return result;

        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        for(String str : strs) {
            char[] data = str.toCharArray();
            Arrays.sort(data);
            String sorted = new String(data);
            ArrayList<String> hashMapArray = hm.getOrDefault(sorted, new ArrayList<String>());
            hashMapArray.add(str);
            hm.put(sorted, hashMapArray);
        }

        for(Map.Entry<String , ArrayList<String>> me : hm.entrySet()) {
            ArrayList<String> al = me.getValue();
            result.add(al);
        }

        return result;

    }
}
