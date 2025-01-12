package dsa.sortingalgorithm;

public class selectionsorting {
    public static void main(String[] args) {
        int[] data = {72, 50, 10, 44, 8, 20};
        selectionsort(data);
    }

    static void selectionsort(int[] data) {
            int k = 0;
            for(int i=0;i<data.length;i++) {
                int max = 0;
                for (int j = 0; j < data.length - i; j++) {
                    if (data[j] > max) {
                        max = data[j];
                        k = j;
                    }
                }
                swapping sw = new swapping();
                sw.swap(data,k,data.length- 1 - i);
            }
            for(int i=0;i<data.length;i++) {
                System.out.println(data[i]);
            }
        }

}
