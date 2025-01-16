package dsa.customqueue;

import java.util.Arrays;

public class customqueue {
    int end = 0;
    int data[];

    public customqueue() {
        data = new int[10];
    }

    public boolean add(int value) {
        if(isFull()) {
            return false;
        }
        data[end] = value;
        end++;
        return true;
    }

    public boolean remove() {
        if(isEmpty()) {
            return false;
        }
        for(int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end = end - 1;
        return true;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("stack is empty");
        }
        return data[0];
    }
    public boolean isFull() {
        return data.length == end - 1;
    }

    public boolean isEmpty() {
        return end == 0;
    }
    public void display() {
        Arrays.stream(data).limit(end).forEach(n -> System.out.println(n));
    }

}
