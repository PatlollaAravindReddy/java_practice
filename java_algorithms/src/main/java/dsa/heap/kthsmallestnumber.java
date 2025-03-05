package dsa.heap;

import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class kthsmallestnumber {
    public static void main(String[] args) {
        List<Integer> result = findKsmallestNumbers(new int[] { 5, 12, 11, -1, 12}, 3);
        result.stream().forEach(n -> System.out.println(n));
    }

    static List<Integer> findKsmallestNumbers(int[] data, int no) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(no, (n1, n2) -> n2 - n1);
        for(int i = 0; i < no; i++) {
            pq.add(data[i]);
        }
        for(int i = no; i < data.length; i++) {
            if(data[i] < pq.peek()) {
                pq.poll();
                pq.add(data[i]);
            }
        }
        return pq.stream().collect(Collectors.toList());
    }
}
