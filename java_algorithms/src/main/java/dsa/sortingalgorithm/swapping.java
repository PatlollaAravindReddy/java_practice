package dsa.sortingalgorithm;

public class swapping {
    public void swap(int data[], int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
