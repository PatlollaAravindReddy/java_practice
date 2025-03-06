package dsa.heap;

import java.util.PriorityQueue;

public class connectropes {
    public static void main(String[] args) {
        int[] data = {4, 3, 2, 6};
        connectropesHelper(data);
    }

    static void connectropesHelper(int[] data) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < data.length; i++) {
            pq.add(data[i]);
        }

        int res = 0;

        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            res = res + first + second;
            pq.add(first + second);
        }
        System.out.println(res);
    }
}
