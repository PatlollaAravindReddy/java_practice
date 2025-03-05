package dsa.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class kclosestpointtoorigin_973 {
    public static void main(String[] args) {
        int[][] pp = {{1, 3}, {3, 4}, {2, -1} };
        int no = 2;
        closertpoint(pp, no);
    }

    static void closertpoint(int[][] data, int no) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(no, (n1, n2) -> distFromOrigin(n2) - distFromOrigin(n1));
        for (int i = 0; i < no; i++) {
            pq.offer(data[i]);
        }
        for (int i = no; i < data.length; i++) {
            if (distFromOrigin(data[i]) < distFromOrigin(pq.peek())) {
                pq.poll();
                pq.offer(data[i]);
            }
        }
        int[][] closestPoints = new int[no][2];
        for (int i = 0; i < no; i++) {
            closestPoints[i] = pq.poll();
        }
        Arrays.stream(closestPoints).forEach(n -> System.out.println(n[0] + " " + n[1]));
    }

    static int distFromOrigin(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}
