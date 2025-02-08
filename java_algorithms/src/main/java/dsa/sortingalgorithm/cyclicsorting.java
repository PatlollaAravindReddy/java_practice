package dsa.sortingalgorithm;

import java.util.Arrays;

public class cyclicsorting {
    public static void main(String[] args) {
        int[] data = {2, 6, 4, 3, 1, 5};
        Arrays.stream(sorthelper(data)).forEach(System.out::println);
    }

    static int[] sorthelper(int[] data) {
        int i = 0;
        swapping sw = new swapping();
        while (i < data.length) {
            int current = data[i] - 1;
            if (data[i] != data[current]) {
                sw.swap(data, i, data[i] - 1);
            } else {
                i++;
            }
        }
        return data;
    }
}
