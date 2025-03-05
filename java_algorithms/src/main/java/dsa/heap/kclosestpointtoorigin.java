package dsa.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

class point {
    int first;
    int second;

    point(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int distFromOrigin() {
        return (first * first) + (second * second);
    }
}
public class kclosestpointtoorigin {
    public static void main(String[] args) {
        point[] points = new point[]{new point(1, 3), new point(3, 4), new point(2, -1)};
        List<point> result = findClosestPoints(points, 2);
        for (point p : result)
            System.out.print("[" + p.first + " , " + p.second + "] ");
    }

    static List<point> findClosestPoints(point[] data, int no) {
        PriorityQueue<point> pq = new PriorityQueue<>(no, (n1, n2) -> n1.distFromOrigin() - n2.distFromOrigin());
        for(int i = 0; i < no; i++) {
            pq.offer(data[i]);
        }
        for(int i = no; i < data.length; i++) {
            if(data[i].distFromOrigin() < pq.peek().distFromOrigin()) {
                pq.poll();
                pq.offer(data[i]);
            }
        }

        return new ArrayList<>(pq);
    }
}
