package dsa.customstack;

public class customstack {
    int[] data;

    public customstack(int size) {
        data = new int[size];
    }

    int ptr = - 1;
    public boolean push(int value) {
        if(isFull()) {
            System.out.println("Stack is full!");
            return false;
        }
        ptr++;
        data[ptr] = value;
        return true;
    }

    public boolean pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty!");
            return false;
        }
        ptr--;
        return true;
    }

    public int peek() throws Exception {
        if(isEmpty()) {
            System.out.println("Stack is empty!");
            throw new Exception();
        }
        return data[ptr];
    }
    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == - 1;
    }

    public void printElements() {
        for(int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }


}
