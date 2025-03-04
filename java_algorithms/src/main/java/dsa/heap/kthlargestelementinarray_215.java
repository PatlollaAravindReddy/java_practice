package dsa.heap;

import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class kthlargestelementinarray_215 {
    public static void main(String[] args) {
        int result = KLargestNumbers(new int[] { 3,2,3,1,2,4,5,5,6}, 4);
        System.out.println(result);
    }

    static int KLargestNumbers(int[] data, int no) {
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
        return pq.peek();
    }
}
