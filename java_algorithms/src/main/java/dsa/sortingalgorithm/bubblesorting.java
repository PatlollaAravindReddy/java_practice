package dsa.sortingalgorithm;

import java.util.Arrays;

public class bubblesorting {
    public static void main(String[] args) {
        int[] data = {2, 1, 3, 5, 4};
        bubbleSort(data);
    }

    static void bubbleSort(int[] data) {
        swapping sw = new swapping();
        for(int i = 0 ; i < data.length; i++) {
            for(int j = 0; j < data.length - 1 - i; j++) {
                if(data[j] > data[j + 1]) {
                    sw.swap(data, j , j + 1);
                }
            }
        }
        Arrays.stream(data).forEach(n -> System.out.println(n));
    }


}
