package coreJavaPractice.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class intervals {
    int start;
    int end;

    public intervals(int start,int end) {
        this.start = start;
        this.end = end;
    }
}
public class listpractice {
    public static void main(String[] args) {
        List<intervals> ll = new ArrayList<>();
        ll.add(new intervals(1, 3));
        ll.add(new intervals(2, 6));
        Iterator<intervals> it = ll.iterator();
        while (it.hasNext()) {
            intervals interval = it.next();
            System.out.println(interval.start + " " + interval.end);
        }
    }
}
