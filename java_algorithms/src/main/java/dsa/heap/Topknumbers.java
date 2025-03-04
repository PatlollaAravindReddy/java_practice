package dsa.heap;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Topknumbers {
    public static void main(String[] args) {
        List<Integer> result = findKLargestNumbers(new int[] { 3, 1, 5, 12, 2, 11 }, 3);
        result.stream().forEach(n -> System.out.println(n));
    }

    static List<Integer> findKLargestNumbers(int[] data, int no) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(no, (n1, n2) -> n1 - n2);
        for(int i = 0; i < no; i++) {
            pq.add(data[i]);
        }
        for(int i = no; i < data.length; i++) {
            if(data[i] > pq.peek()) {
                pq.poll();
                pq.add(data[i]);
            }
        }
        return pq.stream().collect(Collectors.toList());
    }
}
