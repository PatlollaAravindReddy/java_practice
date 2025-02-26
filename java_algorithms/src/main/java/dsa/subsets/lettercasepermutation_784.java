package dsa.subsets;

import java.util.ArrayList;
import java.util.List;

public class lettercasepermutation_784 {
    public static void main(String[] args) {
        String data = "ab7c";
        (permutationHelper(data)).stream().forEach(n -> System.out.println(n));
    }

    static List<String> permutationHelper(String data) {
        List<String> result = new ArrayList<>();
        result.add(data);
        int count = 0;
        for(int i = 0; i < data.length(); i++) {
            int size = result.size();
            for (int j = 0; j < size; j++) {
                String temp = result.get(j);
                char[] arr = temp.toCharArray();
                if(!Character.isDigit(temp.charAt(count))) {
                    if (Character.isUpperCase(temp.charAt(count))) {
                        arr[count] = Character.toLowerCase(temp.charAt(count));
                    }
                    if (Character.isLowerCase(temp.charAt(count))) {
                        arr[count] = Character.toUpperCase(temp.charAt(count));
                    }
                    String result2 = String.valueOf(arr);
                    result.add(result2);
                }
            }
            count++;
        }
        return result;
    }
}
