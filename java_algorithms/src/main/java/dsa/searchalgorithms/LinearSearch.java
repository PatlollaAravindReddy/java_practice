package dsa.searchalgorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] data = {1, 4, 6, 8, 10, 12, 14, 16};
        int no = 14;
        for(int i=0; i<data.length; i++) {
            if(data[i] == no) {
                System.out.println(i);
                break;
            }
        }
    }
}
