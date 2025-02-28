package coreJavaPractice.streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class streamspractice {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
        data.add(6);
        data.stream().forEach(n -> System.out.println(n));
        System.out.println("filter");
        Predicate<Integer> p1 = new Predicate<Integer> () {
            @Override
            public boolean test(Integer a) {
                if(a % 2 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        data.stream().filter(p1).forEach(n -> System.out.println(n));
        System.out.println("map");
        data.stream().map(n -> n * n).forEach(n -> System.out.println(n));
        System.out.println("Flap Mapping");
        List<List<Integer>> dataMap = new ArrayList<>();
        dataMap.add(Arrays.asList(1, 2, 3));
        dataMap.add(Arrays.asList(4, 5, 6));
        dataMap.add(Arrays.asList(7, 8, 9));
        dataMap.add(Arrays.asList(10));
        dataMap.stream().flatMap(Collection::stream).forEach(n -> System.out.println(n));
        System.out.println("hash map");
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("aravind", 28);
        hm.put("chinku", 28);
        hm.put("sai", 33);
        hm.put("dell", 34);
        hm.entrySet().stream().filter(n -> (n.getKey().charAt(0) == 'a')).forEach(n -> System.out.println(n));
        hm.entrySet().stream().filter(n -> (n.getValue() == 28)).forEach(n -> System.out.println(n));
        data.add(3);
        data.add(4);
        data.add(5);
        data.add(6);
        System.out.println(data.stream().collect(Collectors.toList()));
        System.out.println(data.stream().collect(Collectors.toSet()));
        int sum = data.stream().reduce(0, (x, y) -> x + y);
        System.out.println(sum);
    }
}
